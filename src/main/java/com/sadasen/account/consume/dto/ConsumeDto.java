package com.sadasen.account.consume.dto;

import java.io.Serializable;

/**
 * @date 2018年2月28日
 * @author lei.ys
 * @desc
 */
public class ConsumeDto implements Serializable {
	
	private static final long serialVersionUID = 7025389947922077887L;
	
	private long parentId;
	private String name;
	private int type;
	
	public ConsumeDto() {
	}

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
