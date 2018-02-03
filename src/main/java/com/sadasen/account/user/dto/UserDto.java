package com.sadasen.account.user.dto;

import java.io.Serializable;

/**
 * @date 2018年2月3日
 * @author lei.ys
 * @desc
 */
public class UserDto implements Serializable {
	
	private static final long serialVersionUID = 1894097230607980671L;
	
	private String userName;
	private String password;
	
	public UserDto() {
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
