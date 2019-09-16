package com.djhu.hiup.message.server.core.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 互联互通标准值域字典查找
 * @author dihua.wu
 * @date 2018/11/14
 */
@Component
public interface IHlhtDictDao {

    Map<String, String> queryStandardDict(@Param("codeSystem")String codeSystem,
                                          @Param("rangeName") String rangeName,
                                          @Param("code") String code, @Param("name") String name);

    Map<String, String> queryNocodeDict(@Param("codeSystem")String codeSystem,
                                          @Param("rangeName") String rangeName,
                                               @Param("name") String name);

    Map<String, String> queryDeptDict(@Param("codeSystem")String codeSystem,
                                          @Param("dictName") String dictName,
                                          @Param("code") String code, @Param("name") String name);

    //用药途径
    List<Map<String, String>> queryStandardDictForList(@Param("codeSystem")String codeSystem,
                                                      @Param("rangeName") String rangeName,
                                                      @Param("code") String code,
                                                      @Param("name") String name);

    List<Map<String, String>> queryNocodeDictForList(@Param("codeSystem")String codeSystem,
                                                       @Param("rangeName") String rangeName,
                                                       @Param("name") String name);
}
