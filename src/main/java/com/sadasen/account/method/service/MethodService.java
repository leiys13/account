package com.sadasen.account.method.service;

import com.sadasen.account.method.entity.Method;

/**
 * @date 2018年2月6日
 * @author lei.ys
 * @desc
 */
public interface MethodService {
	
	public Method save(Method method);
	
	public int maxSort(long userId);

}
