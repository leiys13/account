package com.sadasen.account.index.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date 2018年1月9日
 * @author lei.ys
 * @desc
 */
@RestController
public class IndexController {

	@GetMapping("/")
	public String index(String name) {
		return "Hello, " + name + "! This is index page. ";
	}
	
}
