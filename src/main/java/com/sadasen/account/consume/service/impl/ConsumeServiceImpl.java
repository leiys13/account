package com.sadasen.account.consume.service.impl;

import org.beetl.sql.core.SQLManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sadasen.account.consume.dao.ConsumeDao;
import com.sadasen.account.consume.entity.Consume;
import com.sadasen.account.consume.service.ConsumeService;

/**
 * @date 2018年2月27日
 * @author lei.ys
 * @desc
 */
@Service
public class ConsumeServiceImpl implements ConsumeService {
	
	@Autowired
	private SQLManager sqlManager;
	@Autowired
	private ConsumeDao consumeDao;

	@Override
	public Consume save(Consume consume) {
		
		int r = sqlManager.insertTemplate(consume, true);;
		if(1==r) {
			return consume;
		}
		return null;
	}

	@Override
	public Consume findById(long id) {
		return consumeDao.single(id);
	}

}
