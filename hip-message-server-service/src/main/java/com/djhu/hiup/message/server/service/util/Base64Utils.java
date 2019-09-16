package com.djhu.hiup.message.server.service.util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * Created by jiangmei on 2018/7/3.
 */
public class Base64Utils {


    /**
     * 加密
     * @param str
     * @return
     */
    public static String getBase64(String str) throws  Exception{
        byte[] b=null;
        String s=null;
        b = str.getBytes(FileUtils.UTF_8);
        if(b!=null){
            s=new BASE64Encoder().encode(b);
        }
        return s;
    }

    /**
     * 解密
     * @param s
     * @return
     */
    public static String getFromBase64(String s)throws Exception{
        byte[] b = null;
        String result = null;
        if (s != null) {
            BASE64Decoder decoder = new BASE64Decoder();
            b = decoder.decodeBuffer(s);
            result = new String(b, FileUtils.UTF_8);
        }
        return result;
    }

}
