package com.sadasen.account.statistics.vo;

import java.io.Serializable;

/**
 * @author leiys13
 * @date 2018年3月1日
 * @desc  统计输出的类
 */
public class StatsVo implements Serializable {
	
	private static final long serialVersionUID = -5602489650776321771L;
	
	private long id;
	private String name;
	private long num;
	
	public StatsVo() {
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

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("statsVo{");
		sb.append("id:"+id)
		.append(", name:"+name)
		.append(", num:"+num)
		.append("}");
		return sb.toString();
	}

}
