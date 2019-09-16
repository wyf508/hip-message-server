package com.djhu.hiup.message.server.service.util;

import org.apache.commons.lang.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jiangmei on 2018/5/11.
 */
public class DataUtils {

    private final static DateFormat DATE_FORMAT = new SimpleDateFormat("yyyyMMddHHmmss");

    public static String getSystemDateFormat() {
        return DATE_FORMAT.format(new Date());
    }


    public static Date parseDate(String strDate, String pattern) {
        if (StringUtils.isEmpty(strDate)) {
            return null;
        }
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        Date date = null;
        try {
            date = df.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static String formatDate(Date date, String pattern)
    {
        if (date == null) {
            return null;
        }
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        return df.format(date);
    }
}
