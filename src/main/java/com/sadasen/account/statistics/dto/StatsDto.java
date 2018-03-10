package com.sadasen.account.statistics.dto;

import java.io.Serializable;

/**
 * @author leiys13
 * @date 2018年3月1日
 * @desc
 */
public class StatsDto implements Serializable {

	private static final long serialVersionUID = 458844284499906893L;
	
	private long userId;
	private String startDate;
	private String endDate;
	private int type;
	// 分页
	private int start;
	private int size;
	
	public StatsDto() {
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
