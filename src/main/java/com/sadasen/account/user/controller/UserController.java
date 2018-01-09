package com.sadasen.account.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date 2018年1月9日
 * @author lei.ys
 * @desc
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
}
