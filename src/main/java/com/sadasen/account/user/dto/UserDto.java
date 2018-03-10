package com.sadasen.account.user.dto;

import com.sadasen.account.common.BaseBean;

/**
 * @date 2018年2月3日
 * @author lei.ys
 * @desc
 */
public class UserDto extends BaseBean {
	
	private static final long serialVersionUID = 2034907386564878875L;
	
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
