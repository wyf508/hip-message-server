package com.djhu.hiup.message.server.core.dao;

import java.util.List;

/**
 * 系统目录配置信息表
 */
public interface ISystemDirDao {

    List selectAll() throws RuntimeException;
}