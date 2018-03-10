package com.sadasen.account.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sadasen.account.common.BaseController;
import com.sadasen.account.user.entity.User;

/**
 * @date 2018年2月26日
 * @author lei.ys
 * @desc
 */
@Controller
@RequestMapping("/page")
public class PageController extends BaseController {

	private static final long serialVersionUID = 8878066217307120517L;

	@GetMapping("/{pageName}")
	public String page(@PathVariable("pageName") String pageName) {
		User user = (User) getRequest().getSession().getAttribute("user");
		System.out.println(user);
		if(null!=user) {
			System.out.println(user.getUserName());
		}
		System.out.println("index:index");
		System.out.println("pageName : "+pageName);
		return pageName;
	}
	
}
