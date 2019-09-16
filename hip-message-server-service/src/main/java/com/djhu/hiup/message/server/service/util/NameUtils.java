package com.djhu.hiup.message.server.service.util;

import com.google.common.base.CaseFormat;

/**
 * 驼峰 下划线命名互转
 * Created by jiangmei on 2018/6/6.
 */
public class NameUtils {


    /**
     * 驼峰命名法转换下划线命名处理
     * @param s
     * @return
     */
    public static String camelToUnderline(String s) {
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, s);
    }

    /**
     * 下划线命名转换驼峰命名法处理
     * @param para
     */
    public static String convertName(String para) {
        return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, para);
    }

    public static void main(String[] args){
        System.out.println(NameUtils.convertName("name_no"));
        System.out.println(NameUtils.camelToUnderline("TestData"));
    }

//    System.out.println(CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_CAMEL, "test-data"));//testData
//    System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "test_data"));//testData
//    System.out.println(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, "test_data"));//TestData
//
//    System.out.println(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, "testdata"));//testdata
//    System.out.println(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, "TestData"));//test_data
//    System.out.println(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_HYPHEN, "testData"));//test-data
}
