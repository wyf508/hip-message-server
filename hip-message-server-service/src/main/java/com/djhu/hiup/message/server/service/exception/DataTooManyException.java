package com.djhu.hiup.message.server.service.exception;

/**
 * Created by jiangmei on 2018/6/22.
 */
public class DataTooManyException extends  RuntimeException{

    private static final String MSG="更新数据存在错误，存在多条更新数据！";

    public DataTooManyException() {
        super(MSG);
    }

    public DataTooManyException(String message) {
        super(message);
    }

    public DataTooManyException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataTooManyException(Throwable cause) {
        super(cause);
    }

    protected DataTooManyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


}
