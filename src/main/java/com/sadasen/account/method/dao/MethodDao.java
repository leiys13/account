package com.sadasen.account.method.dao;

import org.beetl.sql.core.mapper.BaseMapper;

import com.sadasen.account.method.entity.Method;

/**
 * @date 2018年2月6日
 * @author lei.ys
 * @desc
 */
public interface MethodDao extends BaseMapper<Method> {
	
	public int maxSort(long userId);

}
