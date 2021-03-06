package com.sadasen.account.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @date 2018年2月24日
 * @author lei.ys
 * @desc
 */
public class AccountUtil {

	public static final Map<String, String> enMap = new HashMap<>();
	public static final Map<String, String> deMap = new HashMap<>();
	
	static {
		String t1 = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ*";
		String t2 = "qwertyuiopASDFGHJKLzxcvbnm*ZXCVBNMasdfghjklQWERTYUIOP0987654321";
		for(int i=0;i<t1.length();i++) {
			enMap.put(t1.charAt(i)+"", t2.charAt(i)+"");
			deMap.put(t2.charAt(i)+"", t1.charAt(i)+"");
		}
	}
	
	public static String dbEncrypt(String s) {
		StringBuilder sb = new StringBuilder();
		for(char c : s.toCharArray()) {
			sb.append(enMap.get(c+""));
		}
		return sb.toString();
	}
	
	public static String dbDecrypt(String s) {
		StringBuilder sb = new StringBuilder();
		for(char c : s.toCharArray()) {
			sb.append(deMap.get(c+""));
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String secret = "MySQL*28949613";
		String s = dbEncrypt(secret);
		System.out.println(s);
		System.out.println(dbDecrypt(s));
	}

}
