package com.djhu.hiup.message.server.core.dao;

import com.djhu.hiup.message.server.core.model.TableColumnAndMeta;
import java.math.BigDecimal;

/**
 * 交互服务表中列和数据元标识对应关系信息表
 */
public interface ITableColumnAndMetaDao {

    TableColumnAndMeta selectByPrimaryKey(BigDecimal pk) throws RuntimeException;;

    int updateBySelective(TableColumnAndMeta record) throws RuntimeException;;
}