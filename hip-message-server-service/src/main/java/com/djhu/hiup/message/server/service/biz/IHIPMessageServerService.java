package com.djhu.hiup.message.server.service.biz;

import java.util.List;
import java.util.Map;

/**
 * 互联互通webService接口对应的服务接口抽象
 * Created by jiangmei on 2018/5/24.
 */
public interface IHIPMessageServerService {

    /**
     * 新增
     * @param keyAndXmlValMap
     * @return
     * @throws Exception
     */
    public int saveMessage(Map<String, Object> keyAndXmlValMap) throws Exception;

    /**
     * 更新
     * @param keyAndXmlValMap
     * @return
     * @throws Exception
     */
    public int updateMessage(Map<String, Object> keyAndXmlValMap)throws Exception;

    /**
     * 查询
     * @param keyAndXmlValMap
     * @return
     * @throws Exception
     */
    public List selectMessage( Map<String, Object> keyAndXmlValMap)throws Exception;
}
