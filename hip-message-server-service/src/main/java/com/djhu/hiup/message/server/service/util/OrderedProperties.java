package com.djhu.hiup.message.server.service.util;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 顺序读取properties文件
 * Created by jiangmei on 2018/5/16.
 */
public class OrderedProperties extends Properties {
    private static final long serialVersionUID = -4627607243846121965L;

    private final LinkedHashSet<Object> keys = new LinkedHashSet<Object>();

    @Override
	public Enumeration<Object> keys() {
        return Collections.<Object> enumeration(keys);
    }

    @Override
	public Object put(Object key, Object value) {
        keys.add(key);
        return super.put(key, value);
    }

    @Override
	public Set<Object> keySet() {
        return keys;
    }

    @Override
	public Set<String> stringPropertyNames() {
        Set<String> set = new LinkedHashSet<String>();

        for (Object key : this.keys) {
            set.add((String) key);
        }

        return set;
    }


    public static void main(String[] args) throws Exception {
        String fileName= "/config/xml2json/emr/risbg.properties";
        Properties props = new OrderedProperties();
        String strPath = System.getProperty("user.dir");
        //加载属性文件
        props.load(new InputStreamReader(new FileInputStream(strPath+fileName),"UTF-8"));
        StringBuffer stringBuffer=new StringBuffer();
        for(Object key: props.keySet()){
            stringBuffer.append("null as ");
            stringBuffer.append(props.getProperty((String) key));
            stringBuffer.append(",\n");
        }
        System.out.println(stringBuffer);
    }
}
