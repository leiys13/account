package com.sadasen.account.consume.dao;

import org.beetl.sql.core.annotatoin.Param;
import org.beetl.sql.core.mapper.BaseMapper;

import com.sadasen.account.consume.entity.Consume;

/**
 * @date 2018年2月27日
 * @author lei.ys
 * @desc
 */
public interface ConsumeDao extends BaseMapper<Consume> {
	
	public String findMaxCodeByParentId(@Param("type") int type, @Param("parentId") long parentId);

}
