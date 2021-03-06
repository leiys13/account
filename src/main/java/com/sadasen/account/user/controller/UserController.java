package com.sadasen.account.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sadasen.account.common.BaseController;
import com.sadasen.account.user.dto.UserDto;
import com.sadasen.account.user.entity.User;
import com.sadasen.account.user.service.UserService;
import com.sadasen.core.common.Consts;
import com.sadasen.core.common.JsonResult;

/**
 * @date 2018年1月9日
 * @author lei.ys
 * @desc
 */
@RestController
public class UserController extends BaseController {
	
	private static final long serialVersionUID = 1987403284173945339L;
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value="/register")
	public JsonResult register(UserDto dto) {
		User user = new User();
		user.setUserName(dto.getUserName());
		user.setPassword(dto.getPassword());
		user = userService.save(user);
		if(null!=user) {
			return new JsonResult(user);
		}
		return new JsonResult("error to register!", 500);
	}
	
	@PostMapping("/login")
	public JsonResult login(UserDto userDto) {
		User user = userService.findToLogin(userDto);
		if(null!=user) {
			getRequest().getSession().setAttribute(Consts.LOGIN_USER, user);
			return new JsonResult(user);
		}
		return new JsonResult("error to register!", 500);
	}
	
	@GetMapping("/user/{id}")
	public JsonResult userInfo(@PathVariable("id") long id) {
		User user = userService.findById(id);
		if(null!=user) {
			return new JsonResult(user);
		}
		return new JsonResult("error to get info!", 500);
	}
	
	@GetMapping("/info/{id}")
	public JsonResult info(@PathVariable("id") long id) {
		User user = userService.getById(id);
		if(null!=user) {
			return new JsonResult(user);
		}
		return new JsonResult("error to get info!", 500);
	}
	
}
