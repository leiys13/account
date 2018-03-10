package com.sadasen.account.consume.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sadasen.account.common.BaseController;
import com.sadasen.account.consume.dto.ConsumeDto;
import com.sadasen.account.consume.entity.Consume;
import com.sadasen.account.consume.service.ConsumeService;
import com.sadasen.account.util.Utils;
import com.sadasen.core.common.Consts;
import com.sadasen.core.common.JsonResult;

/**
 * @date 2018年2月27日
 * @author lei.ys
 * @desc
 */
@RestController
@RequestMapping("/consume")
public class ConsumeController extends BaseController {

	private static final long serialVersionUID = 4463234828559375642L;
	
	@Autowired
	private ConsumeService consumeService;
	
	@PostMapping("/add")
	public JsonResult add(ConsumeDto consumeDto) {
		Consume consume = new Consume(consumeDto);
		consume.setUserId(Utils.getLoginUserId(getRequest()));
		consume = consumeService.save(consume);
		if(null==consume) {
			return new JsonResult("系统错误！", Consts.REQUEST_ERROR_CODE);
		} else if(-1L==consume.getId()) {
			return new JsonResult("请求无效！", Consts.REQUEST_FAILURE_CODE);
		}
		return new JsonResult(consume);
	}
	
	@GetMapping("/listByParent/{type}/{parentId}")
	public JsonResult list(@PathVariable("type") int type, @PathVariable("parentId") long parentId) {
		Utils.printInfo("list success");
		return new JsonResult(new ArrayList<>());
	}
	
}
