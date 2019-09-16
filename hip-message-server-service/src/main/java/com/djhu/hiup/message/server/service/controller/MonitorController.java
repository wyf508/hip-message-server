package com.djhu.hiup.message.server.service.controller;

import com.djhu.hiup.message.server.service.biz.impl.MonitorServiceImpl;
import com.hiup.base.Monitor3Control;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dihua.wu
 * @date 2018/11/16
 */
@Controller
@RequestMapping("/hip-message-server")
public class MonitorController extends Monitor3Control<MonitorServiceImpl> {

    @Autowired
    @Override
    public void setMonitorService(MonitorServiceImpl monitorService) {
        super.monitorService = monitorService;
    }
}
