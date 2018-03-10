package com.sadasen.account.statistics.dao;

import java.util.List;

import org.beetl.sql.core.mapper.BaseMapper;

import com.sadasen.account.statistics.dto.StatsDto;
import com.sadasen.account.statistics.entity.Statistics;
import com.sadasen.account.statistics.vo.StatsVo;

/**
 * @author leiys13
 * @date 2018年3月1日
 * @desc
 */
public interface StatisticsDao extends BaseMapper<Statistics> {
	
	/**
	 * 查询当日总收入或支出
	 * @param statsDto
	 * @return
	 */
	public long selectTotalToday(StatsDto statsDto);
	
	/**
	 * 查询在一段时间内的总收入或支出
	 * @param statsDto
	 * @return
	 */
	public long selectTotalByTimeArea(StatsDto statsDto);
	
	/**
	 * 查询总的收入或支出
	 * @param statsDto
	 * @return
	 */
	public long selectTotalAll(StatsDto statsDto);
	
	/**
	 * 查询总的日均收入或支出
	 * @param statsDto
	 * @return
	 */
	public long selectAvgAll(StatsDto statsDto);
	
	/**
	 * 查询每天的总收入或支出
	 * @param statsDto
	 * @return
	 */
	public List<StatsVo> selectEachDayTotal(StatsDto statsDto);
	
	/**
	 * 查询每个分类的总收入或支出
	 * @param statsDto
	 * @return
	 */
	public List<StatsVo> selectEachConsumeTotal(StatsDto statsDto);
	
	/**
	 * 查询每月的总收入或支出
	 * @param statsDto
	 * @return
	 */
	public List<StatsVo> selectMonthTotal(StatsDto statsDto);
	
	/**
	 * 查询每年的总收入或支出
	 * @param statsDto
	 * @return
	 */
	public List<StatsVo> selectYearTotal(StatsDto statsDto);

}
