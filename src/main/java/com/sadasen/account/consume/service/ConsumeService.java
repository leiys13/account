package com.sadasen.account.consume.service;

import com.sadasen.account.consume.entity.Consume;

/**
 * @date 2018年2月27日
 * @author lei.ys
 * @desc
 */
public interface ConsumeService {
	
	public Consume save(Consume consume);
	
	public Consume findById(long id);

}
