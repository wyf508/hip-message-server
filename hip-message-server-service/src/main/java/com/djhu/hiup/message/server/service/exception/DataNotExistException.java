package com.djhu.hiup.message.server.service.exception;

/**
 * Created by jiangmei on 2018/6/22.
 */
public class DataNotExistException extends  RuntimeException{

    private static final String MSG="更新数据存在错误，更新数据不存在！";

    public DataNotExistException() {
        super(MSG);
    }

    public DataNotExistException(String message) {
        super(message);
    }

    public DataNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataNotExistException(Throwable cause) {
        super(cause);
    }

    protected DataNotExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


}
