package com.sadasen.core.common;

import java.io.Serializable;

/**
 * @date 2018年2月3日
 * @author lei.ys
 * @desc
 */
public class JsonResult implements Serializable {

	private static final long serialVersionUID = 5884669464054792567L;
	
	private Object data;
	private int code = Consts.REQUEST_SUCCESS_CODE;
	private String msg = "";
	
	public JsonResult() {
	}
	
	public JsonResult(Object data) {
		this.data = data;
	}
	
	public JsonResult(String msg, int code) {
		this.msg = msg;
		this.code = code;
	}
	
	public JsonResult(Object data, int code, String msg) {
		this.data = data;
		this.code = code;
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
