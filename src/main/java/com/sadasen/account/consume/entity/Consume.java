package com.sadasen.account.consume.entity;

import java.io.Serializable;
import java.util.Date;

import org.beetl.sql.core.annotatoin.Table;

import com.sadasen.account.consume.dto.ConsumeDto;

/**
 * @date 2018年2月27日
 * @author lei.ys
 * @desc
 */
@Table(name="account_consume")
public class Consume implements Serializable {
	
	private static final long serialVersionUID = 2522380999564435119L;
	
	private long id;
	private String name;
	private long parentId;
	private long userId;
	private int type;
	private String code;
	private int level;
	private int sort;
	private int hasChild;
	private Date createTime;
	
	public Consume() {
	}
	
	public Consume(ConsumeDto consumeDto) {
		this.name = consumeDto.getName();
		this.parentId = consumeDto.getParentId();
		this.type = consumeDto.getType();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public int getHasChild() {
		return hasChild;
	}

	public void setHasChild(int hasChild) {
		this.hasChild = hasChild;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
