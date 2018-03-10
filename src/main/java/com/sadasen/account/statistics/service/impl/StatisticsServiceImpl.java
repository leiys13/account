package com.sadasen.account.statistics.service.impl;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sadasen.account.statistics.dao.StatisticsDao;
import com.sadasen.account.statistics.dto.StatsDto;
import com.sadasen.account.statistics.service.StatisticsService;
import com.sadasen.account.statistics.vo.StatsVo;
import com.sadasen.util.DateTimeUtil;

/**
 * @author leiys13
 * @date 2018年3月1日
 * @desc
 */
@Service
public class StatisticsServiceImpl implements StatisticsService {
	
	@Autowired
	private StatisticsDao statisticsDao;

	@Override
	public long getTotalToday(StatsDto statsDto) {
		return statisticsDao.selectTotalToday(statsDto);
	}

	@Override
	public long getTotalWeek(StatsDto statsDto) {
		statsDto.setStartDate(DateTimeUtil.getFirstDayOfWeek());
		statsDto.setEndDate(DateTimeUtil.getNowDateString());
		return statisticsDao.selectTotalByTimeArea(statsDto);
	}

	@Override
	public long getAvgWeek(StatsDto statsDto) {
		return getTotalWeek(statsDto)/LocalDate.now().getDayOfWeek().getValue();
	}

	@Override
	public long getTotalMonth(StatsDto statsDto) {
		statsDto.setStartDate(LocalDate.now().with(TemporalAdjusters.firstDayOfMonth()).toString());
		statsDto.setEndDate(LocalDate.now().toString());
		return statisticsDao.selectTotalByTimeArea(statsDto);
	}

	@Override
	public long getAvgMonth(StatsDto statsDto) {
		return getTotalMonth(statsDto)/LocalDate.now().getDayOfMonth();
	}

	@Override
	public long getTotalYear(StatsDto statsDto) {
		statsDto.setStartDate(LocalDate.now().with(TemporalAdjusters.firstDayOfYear()).toString());
		statsDto.setEndDate(LocalDate.now().toString());
		return statisticsDao.selectTotalByTimeArea(statsDto);
	}

	@Override
	public long getAvgYear(StatsDto statsDto) {
		return getTotalYear(statsDto)/LocalDate.now().getDayOfYear();
	}

	@Override
	public long getTotalAll(StatsDto statsDto) {
		return statisticsDao.selectTotalAll(statsDto);
	}

	@Override
	public long getAvgAll(StatsDto statsDto) {
		return statisticsDao.selectAvgAll(statsDto);
	}

	@Override
	public List<StatsVo> getEachDayTotal(StatsDto statsDto) {
		return statisticsDao.selectEachDayTotal(statsDto);
	}

	@Override
	public List<StatsVo> getEachMonthTotal(StatsDto statsDto) {
		return statisticsDao.selectMonthTotal(statsDto);
	}

	@Override
	public List<StatsVo> getEachYearTotal(StatsDto statsDto) {
		return statisticsDao.selectYearTotal(statsDto);
	}

	@Override
	public List<StatsVo> getEachConsumeTotal(StatsDto statsDto) {
		return statisticsDao.selectEachConsumeTotal(statsDto);
	}

	@Override
	public List<StatsVo> getEachConsumeTotalAll(StatsDto statsDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
