package com.djhu.hiup.message.server.service.exception;

/**
 * Created by jiangmei on 2018/6/22.
 */
public class DataExistedException extends  RuntimeException{

    private static final String MSG="新增数据存在错误，数据已经存在！";

    public DataExistedException() {
        super(MSG);
    }

    public DataExistedException(String message) {
        super(message);
    }

    public DataExistedException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataExistedException(Throwable cause) {
        super(cause);
    }

    protected DataExistedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
