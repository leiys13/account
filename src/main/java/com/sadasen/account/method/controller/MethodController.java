package com.sadasen.account.method.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sadasen.account.common.JsonResult;
import com.sadasen.account.method.entity.Method;
import com.sadasen.account.method.service.MethodService;

/**
 * @date 2018年2月6日
 * @author lei.ys
 * @desc
 */
@RestController
@RequestMapping("/method")
public class MethodController {
	
	@Autowired
	private MethodService methodService;

	@PostMapping
	public JsonResult method(@RequestBody Method method) {
		method = methodService.save(method);
		if(null!=method) {
			return new JsonResult(method);
		} else {
			return new JsonResult("新增支出方式出错！", 500);
		}
	}
	
}
