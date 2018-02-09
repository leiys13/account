package com.sadasen.account.method.entity;

import org.beetl.sql.core.annotatoin.Table;

/**
 * @date 2018年2月6日
 * @author lei.ys
 * @desc
 */
@Table(name="account_method")
public class Method {
	
	private long id;
	private String method;
	private int sort;
	
	private long userId;
	
	public Method() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

}
