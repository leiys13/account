package com.sadasen.account.common;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @date 2018年2月26日
 * @author lei.ys
 * @desc
 */
public class BaseController implements Serializable {

	private static final long serialVersionUID = -648539783788047592L;

	public HttpServletRequest getRequest() {
		ServletRequestAttributes attrs = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes(); 
		return attrs.getRequest();
	}
	
}
