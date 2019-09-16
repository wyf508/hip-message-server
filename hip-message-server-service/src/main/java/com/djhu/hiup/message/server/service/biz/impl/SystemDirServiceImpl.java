package com.djhu.hiup.message.server.service.biz.impl;

import com.djhu.hiup.message.server.core.dao.ISystemDirDao;
import com.djhu.hiup.message.server.core.model.SystemDir;
import com.djhu.hiup.message.server.service.util.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jiangmei on 2018/6/22.
 */
@Component("systemDirService")
public class SystemDirServiceImpl {

    @Resource
    private ISystemDirDao systemDirDao;

    private List selectAll(){
        @SuppressWarnings("rawtypes")
		List list=systemDirDao.selectAll();
        if(list==null||list.size()==0){
            throw new RuntimeException("SYSTEM_DIR系统目录表配置错误，必须进行配置！！");
        }
        return list;
    }

    private static Map<BigDecimal,SystemDir> systemDirMap=null;
    private static SystemDir systemDir=null;
    
    private void initFileSystem() throws Exception {
        if(StringUtils.isNotEmpty(systemDirMap)){
            return;
        }
        List<SystemDir> systemDirList= selectAll();
        systemDirMap=new HashMap<BigDecimal, SystemDir>();
        for(SystemDir tmplSystemDir:systemDirList){
            systemDirMap.put(tmplSystemDir.getPk(),tmplSystemDir);
        }
        systemDir=systemDirList.get(0);
    }

    public Map<BigDecimal,SystemDir> getSystemDirMap() throws Exception{
        initFileSystem();
        return systemDirMap;
    }

    public SystemDir getOneSystemDir() throws Exception{
        initFileSystem();
        return systemDir;
    }

}
