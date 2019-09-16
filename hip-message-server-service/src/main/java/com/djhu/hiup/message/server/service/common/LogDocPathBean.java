package com.djhu.hiup.message.server.service.common;

/**
 * @author YFC  文档日志路径实体类
 * @create 2018-12-05 上午 7:25
 */
public class LogDocPathBean{

    /**
     * 接口编号
     */
    private String interNumber;

    /**
     * 文档编号
     */
    private String docNumber;

    /**
     * 业务编码
     */
    private String businessCode;

    public LogDocPathBean() {
    }

    public LogDocPathBean(String docNumber){
        this.docNumber = docNumber;
    }

    public LogDocPathBean(String interNumber, String businessCode, String docNumber) {
        this.interNumber = interNumber;
        this.businessCode = businessCode;
        this.docNumber = docNumber;
    }

    public String getInterNumber() {
        return interNumber;
    }

    public void setInterNumber(String interNumber) {
        this.interNumber = interNumber;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }
}
