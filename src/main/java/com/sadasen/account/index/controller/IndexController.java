package com.sadasen.account.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.sadasen.account.common.BaseController;

/**
 * @date 2018年1月9日
 * @author lei.ys
 * @desc
 */
@Controller
public class IndexController extends BaseController {

	private static final long serialVersionUID = 2629139021960416406L;

	@GetMapping("/logout")
	public String logout() {
		getRequest().getSession().removeAttribute("user");
		return "redirect:/page/login";
	}
	
}
