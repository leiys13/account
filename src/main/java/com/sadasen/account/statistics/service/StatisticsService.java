package com.sadasen.account.statistics.service;

import java.util.List;

import com.sadasen.account.statistics.dto.StatsDto;
import com.sadasen.account.statistics.vo.StatsVo;

/**
 * @author leiys13
 * @date 2018年2月28日
 * @desc
 */
public interface StatisticsService {
	
	/**
	 * 今日总收入或支出
	 * @return
	 */
	public long getTotalToday(StatsDto statsDto);
	
	/**
	 * 周 总收入或支出
	 * @return
	 */
	public long getTotalWeek(StatsDto statsDto);
	
	/**
	 * 周 日均收入或支出
	 * @return
	 */
	public long getAvgWeek(StatsDto statsDto);
	
	/**
	 * 月 总收入或支出
	 * @return
	 */
	public long getTotalMonth(StatsDto statsDto);
	
	/**
	 * 月 日均收入或支出
	 * @return
	 */
	public long getAvgMonth(StatsDto statsDto);
	
	/**
	 * 年 总收入或支出
	 * @return
	 */
	public long getTotalYear(StatsDto statsDto);
	
	/**
	 * 年 日均收入或支出
	 * @return
	 */
	public long getAvgYear(StatsDto statsDto);
	
	/**
	 * 总收入或支出
	 * @return
	 */
	public long getTotalAll(StatsDto statsDto);
	
	/**
	 * 总日均收入或支出
	 * @return
	 */
	public long getAvgAll(StatsDto statsDto);
	
	/**
	 * 每日总计 收入或支出
	 * @return
	 */
	public List<StatsVo> getEachDayTotal(StatsDto statsDto);
	
	/**
	 * 每月总计 收入或支出
	 * @return
	 */
	public List<StatsVo> getEachMonthTotal(StatsDto statsDto);
	
	/**
	 * 每年总计 收入或支出
	 * @return
	 */
	public List<StatsVo> getEachYearTotal(StatsDto statsDto);
	
	/**
	 * 每种分类总计 收入或支出 高低排序
	 * @return
	 */
	public List<StatsVo> getEachConsumeTotal(StatsDto statsDto);
	
	/**
	 * 某种分类总计（包含子分类）
	 * @return
	 */
	public List<StatsVo> getEachConsumeTotalAll(StatsDto statsDto);
	
}
