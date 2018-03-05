package com.sadasen.account.common;

import java.io.Serializable;

import com.sadasen.account.util.Utils;

/**
 * @date 2018年3月5日
 * @author lei.ys
 * @desc
 */
public class BaseBean implements Serializable {

	private static final long serialVersionUID = 3648941478552624552L;
	
	@Override
	public String toString() {
		return Utils.writeJson(this);
	}

}
