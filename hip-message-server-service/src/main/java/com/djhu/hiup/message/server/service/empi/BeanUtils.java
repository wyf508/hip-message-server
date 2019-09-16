package com.djhu.hiup.message.server.service.empi;

import java.util.Map;
import org.apache.commons.beanutils.BeanMap;

/**
 * Created by jiangmei on 2018/7/6.
 */
public class BeanUtils {

    /**
     * map转换成Object对象
     * @param map
     * @param beanClass
     * @return
     * @throws Exception
     */
    public static Object mapToObject(Map<String, Object> map, Class<?> beanClass) throws Exception {
        if (map == null) {
            return null;
        }
        Object obj = beanClass.newInstance();
        org.apache.commons.beanutils.BeanUtils.populate(obj, map);
        return obj;
    }

    /**
     * Object转换成map对象
     * @param obj
     * @return
     */
    public static Map<?, ?> objectToMap(Object obj) {
        if(obj == null) {
            return null;
        }

        return new BeanMap(obj);
    }


}
