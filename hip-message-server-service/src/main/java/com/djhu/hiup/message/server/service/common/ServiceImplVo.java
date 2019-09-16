package com.djhu.hiup.message.server.service.common;

/**
 * 服务代码所对应的服务实现类相关信息
 * Created by jiangmei on 2018/6/7.
 */
public class ServiceImplVo {

    private String name;

    private String comment;

    private String methodName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public ServiceImplVo(String name, String comment, String methodName) {
        this.name = name;
        this.comment = comment;
        this.methodName = methodName;
    }
}
