package com.sadasen.account.util;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import com.sadasen.account.user.entity.User;
import com.sadasen.core.common.Consts;

/**
 * @date 2018年3月1日
 * @author lei.ys
 * @desc
 */
public class Utils implements Serializable {

	private static final long serialVersionUID = 3166326874842161609L;

	/**
	 * 获得当前登录用户
	 * @param request
	 * @return
	 */
	public static User getLoginUser(HttpServletRequest request) {
		return (User) request.getSession().getAttribute(Consts.LOGIN_USER);
	}
	
	/**
	 * 获得当前登录用户的ID
	 * @param request
	 * @return
	 */
	public static long getLoginUserId(HttpServletRequest request) {
		return getLoginUser(request).getId();
	}
	
	
	public static void main(String[] args) {
		String s = "abcdefg";
		String end3 = s.substring(s.length()-3);
		System.out.println(end3);
	}
	
}
