package com.sadasen.account.statistics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sadasen.account.common.BaseController;
import com.sadasen.account.statistics.dto.StatsDto;
import com.sadasen.account.statistics.service.StatisticsService;
import com.sadasen.account.statistics.vo.StatsVo;
import com.sadasen.core.common.JsonResult;

/**
 * @author leiys13
 * @date 2018年2月28日
 * @desc
 */
@RestController
@RequestMapping("/statistics")
public class StatisticsController extends BaseController {
	
	private static final long serialVersionUID = -4612724393640416703L;
	
	@Autowired
	private StatisticsService statisticsService;
	
	@GetMapping("/thisday/total/${type}")
	public JsonResult getTodayTotal(@PathVariable("type") int type) {
		JsonResult result = new JsonResult();
		
		return result;
	}
	
	@GetMapping("/weekTotal")
	public JsonResult getWeekTotal() {
		double total = statisticsService.getTotalMonth(new StatsDto());
		return new JsonResult(total);
	}

	@GetMapping("/eachDayTotal")
	public JsonResult getEachDayTotal(StatsDto statsDto) {
		List<StatsVo> dateList = statisticsService.getEachDayTotal(statsDto);
		return new JsonResult(dateList);
	}

}
