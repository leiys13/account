package com.sadasen.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

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
	
	public static String getNowDateString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		return dtf.format(LocalDate.now());
	}
	
	public static String getFirstDayOfWeek() {
		LocalDate date = LocalDate.now();
		return date.plusDays(1-date.getDayOfWeek().getValue()).toString();
	}
	
	
	
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		date = LocalDate.of(2018, 2, 26);
		System.out.println(date);
		System.out.println(date.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println(date.plusDays(1-date.getDayOfWeek().getValue()));
		
		System.out.println(date.getDayOfMonth());
	}

}
