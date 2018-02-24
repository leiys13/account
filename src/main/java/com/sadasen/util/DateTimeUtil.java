package com.sadasen.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @date 2018年2月3日
 * @author lei.ys
 * @desc
 */
public class DateTimeUtil {
	
	public static String getNow() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return dtf.format(LocalDateTime.now());
	}

}
