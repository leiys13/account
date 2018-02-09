package com.sadasen.account.method.service.impl;

import org.beetl.sql.core.SQLManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sadasen.account.method.dao.MethodDao;
import com.sadasen.account.method.entity.Method;
import com.sadasen.account.method.service.MethodService;

/**
 * @date 2018年2月6日
 * @author lei.ys
 * @desc
 */
@Service
public class MethodServiceImpl implements MethodService {
	
	@Autowired
	private SQLManager sqlManager;
	
	@Autowired
	private MethodDao methodDao;
	
	@Override
	public Method save(Method method) {
		int sort = maxSort(method.getUserId());
		method.setSort(sort+1);
		int r = sqlManager.insert(method, true);
		if(1==r) {
			return method;
		}
		return null;
	}

	@Override
	public int maxSort(long userId) {
		Integer max = methodDao.maxSort(userId);
		return null==max?0:max;
	}

}
