package com.sadasen.account.common;

import javax.servlet.http.HttpServletRequest;

import com.sadasen.account.user.entity.User;

/**
 * @author leiys13
 * @date 2018年2月27日
 * @desc
 */
public class Utils {
	
	public static User getLoginUser(HttpServletRequest request) {
		return (User) request.getSession().getAttribute(AccountConsts.LOGIN_USER);
	}
	
	public static long getLoginUserId(HttpServletRequest request) {
		return getLoginUser(request).getId();
	}

}
