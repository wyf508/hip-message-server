package com.djhu.hiup.message.server.core.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.TypeHandlerRegistry;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Component
@Intercepts({
        @Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class}),
        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class,
                RowBounds.class, ResultHandler.class})})

public class MybatisInterceptor implements Interceptor {
    private static SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmssS");
    private static final Logger log = LoggerFactory.getLogger(MybatisInterceptor.class.getName());


    @SuppressWarnings("unused")
    private Properties properties;

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];
        Object parameter = null;
        if (invocation.getArgs().length > 1) {
            parameter = invocation.getArgs()[1];
        }
        String sqlId = mappedStatement.getId();
        BoundSql boundSql = mappedStatement.getBoundSql(parameter);
        Configuration configuration = mappedStatement.getConfiguration();
        Object returnValue = null;
        long start = System.currentTimeMillis();
        returnValue = invocation.proceed();
        long end = System.currentTimeMillis();
        long time = (end - start);
        if (time > 1) {
            String sql = getSql(configuration, boundSql, sqlId, time);
            log.info(sql);
        }
        return returnValue;
    }

    public String getSql(Configuration configuration, BoundSql boundSql, String sqlId, long time) {
        Map<String, Object> map = new HashMap<String, Object>(0);
        String sql = showSql(configuration, boundSql, map);
        try {
            StringBuilder str = new StringBuilder(100);
            str.append(sqlId);
            str.append(":");
            str.append(sql);
            str.append(":");
            str.append(time);
            str.append("ms");
            return str.toString();
        } finally {

        }
    }


    public String showSql(Configuration configuration, BoundSql boundSql, Map<String, Object> map) {
        Object parameterObject = boundSql.getParameterObject();
        List<ParameterMapping> parameterMappings = boundSql.getParameterMappings();
        String sql = boundSql.getSql().replaceAll("[\\s]+", " ");

        if (parameterObject != null && parameterMappings.size() > 0) {
            TypeHandlerRegistry typeHandlerRegistry = configuration.getTypeHandlerRegistry();
            if (typeHandlerRegistry.hasTypeHandler(parameterObject.getClass())) {
                String objparam = getParameterValue(parameterObject);
                sql = sql.replaceFirst("\\?", objparam);
                map.put("0", objparam);
            } else {
                MetaObject metaObject = configuration.newMetaObject(parameterObject);
                int i = 0;
                for (ParameterMapping parameterMapping : parameterMappings) {
                    String propertyName = parameterMapping.getProperty();
                    if (metaObject.hasGetter(propertyName)) {
                        Object obj = metaObject.getValue(propertyName);
                        String parame = getParameterValue(obj);
                        sql = sql.replaceFirst("\\?", parame);
                        map.put(String.valueOf(i), parame);
                    } else if (boundSql.hasAdditionalParameter(propertyName)) {
                        Object obj = boundSql.getAdditionalParameter(propertyName);
                        String parame = getParameterValue(obj);
                        sql = sql.replaceFirst("\\?", parame);
                        map.put(String.valueOf(i), parame);
                    }
                }
            }
        }
        return sql;
    }

    private String getParameterValue(Object obj) {
        String value = null;
        if (obj instanceof String) {
            value = "'" + obj.toString() + "'";
        } else if (obj instanceof Date || obj instanceof Timestamp) {
            DateFormat formatter = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.CHINA);
            value = "'" + formatter.format(obj) + "'";
        } else {
            if (obj != null) {
                value = obj.toString();
            } else {
                value = "''";
            }
        }
        return value;
    }


    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }
    @Override
    public void setProperties(Properties properties0) {
        this.properties = properties0;
    }


    private Object parseTimestamp(String textTrim) {
        String eL = "[0-9]{4}-[0-9]{2}-[0-9]{2}";//yyyy-MM-dd
        String eL2 = "[0-9]{4}-[0-9]{2}-[0-9]{2} [0-9]{2}:[0-9]{2}:[0-9]{2}";//yyyy-MM-dd HH:mm:ss
        String eL3 = "[0-9]{4}/[0-9]{2}/[0-9]{2}";//yyyy/MM/dd
        String eL4 = "[0-9]{4}/[0-9]{2}/[0-9]{2} [0-9]{2}:[0-9]{2}:[0-9]{2}";//yyyy/MM/dd HH:mm:ss
        String eL5 = "[0-9]{4}[0-9]{2}[0-9]{2}";//yyyyMMdd
        String eL6 = "[0-9]{4}[0-9]{2}[0-9]{2}[0-9]{2}[0-9]{2}[0-9]{2}";//yyyyMMddHHmmss


        if (textTrim == null || "".equals(textTrim)) {
            return null;
        }

        Object time = null;
        Pattern p = Pattern.compile(eL);
        Matcher m = p.matcher(textTrim);
        if (m.matches()) {
            return time = "to_timestamp('" + textTrim + "','yyyy-mm-dd')";
        }
        p = Pattern.compile(eL2);
        m = p.matcher(textTrim);
        if (m.matches()) {
            return time = "to_timestamp('" + textTrim + "','yyyy-mm-dd hh24:mi:ss')";
        }
        p = Pattern.compile(eL3);
        m = p.matcher(textTrim);
        if (m.matches()) {
            return time = "to_timestamp('" + textTrim + "','yyyy/mm/dd')";
        }
        p = Pattern.compile(eL4);
        m = p.matcher(textTrim);
        if (m.matches()) {
            return time = "to_timestamp('" + textTrim + "','yyyy/mm/dd hh24:mi:ss')";
        }
        p = Pattern.compile(eL5);
        m = p.matcher(textTrim);
        if (m.matches()) {
            return time = "to_timestamp('" + textTrim + "','yyyymmdd')";
        }
        p = Pattern.compile(eL6);
        m = p.matcher(textTrim);
        if (m.matches()) {
            return time = "to_timestamp('" + textTrim + "','yyyymmddhh24miss')";
        }
        log.error("日期不合法,格式为yyyyMMddHHmmss，月份应该由两位数字组成！！！");
        return time;

    }
}
