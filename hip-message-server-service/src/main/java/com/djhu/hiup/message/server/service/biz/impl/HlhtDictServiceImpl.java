package com.djhu.hiup.message.server.service.biz.impl;

import com.djhu.hiup.message.server.core.dao.IHlhtDictDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 互联互通标准值域字典查找
 * @author dihua.wu
 * @date 2018/11/14
 */
@Component
public class HlhtDictServiceImpl {

    @Autowired
    private IHlhtDictDao hlhtDictDao;

    public Map<String, String> queryStandardDict(String codeSystem, String rangeName, String code, String name) {

        return hlhtDictDao.queryStandardDict(codeSystem, rangeName, code, name);
    }

    public Map<String, String> queryNocodeDict(String codeSystem, String rangeName, String name) {
        return hlhtDictDao.queryNocodeDict(codeSystem, rangeName, name);
    }

    public Map<String, String> queryDeptDict(String codeSystem, String dictName, String code, String name) {
        return hlhtDictDao.queryDeptDict(codeSystem, dictName, code, name);
    }

    public List<Map<String, String>> queryStandardDictForList(String codeSystem, String rangeName, String code, String name) {

        return hlhtDictDao.queryStandardDictForList(codeSystem, rangeName, code, name);
    }

    public List<Map<String, String>> queryNocodeDictForList(String codeSystem, String rangeName, String name) {

        return hlhtDictDao.queryNocodeDictForList(codeSystem, rangeName, name);
    }

}
