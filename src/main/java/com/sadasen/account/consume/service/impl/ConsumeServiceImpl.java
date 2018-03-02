package com.sadasen.account.consume.service.impl;

import java.util.Date;

import org.beetl.sql.core.SQLManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sadasen.account.consume.dao.ConsumeDao;
import com.sadasen.account.consume.entity.Consume;
import com.sadasen.account.consume.service.ConsumeService;
import com.sadasen.util.StringUtil;

/**
 * @date 2018年2月27日
 * @author lei.ys
 * @desc
 */
@Service
public class ConsumeServiceImpl implements ConsumeService {
	
	@Autowired
	private SQLManager sqlManager;
	@Autowired
	private ConsumeDao consumeDao;

	@Override
	public Consume save(Consume consume) {
		
		/** code设置 */
		if(0==consume.getParentId()) {
			String maxCode = consumeDao.findMaxCodeByParentId(consume.getType(), consume.getParentId());
			int codeInt = this.getCodeEnd3(maxCode);
			if(0==codeInt) {
				consume.setId(-1L);
				return consume;
			}
			consume.setCode(codeInt+"");
		} else {
			Consume parent = consumeDao.single(consume.getParentId());
			System.out.println(parent);
		}
		
		Consume parent = consumeDao.single(consume.getParentId());
		if(null != parent) {
			
		}
		String parentCode = StringUtil.ifNull(parent.getCode());
		if(0==parent.getHasChild()) {
			consume.setCode(parentCode+100);
		} else {
			String max = consumeDao.findMaxCodeByParentId(consume.getType(), consume.getParentId());
			if(StringUtil.isEmpty(max)) {
				consume.setCode(100+"");
			}
		}
		
		if(0==consume.getParentId()) {
			consume.setLevel(0);
		} else {
			/** 根据父级别+1设置 */
		}
		
		/** sort设置 */
		
		/** 父分类hasChild设置 */
		
		consume.setCreateTime(new Date());
		
		int r = sqlManager.insertTemplate(consume, true);;
		if(1==r) {
			return consume;
		}
		return null;
	}

	@Override
	public Consume findById(long id) {
		return consumeDao.single(id);
	}
	
	@Override
	public String getMaxCodeByParent(long id) {
		
		return null;
	}
	
	private int getCodeEnd3(String code) {
		if(StringUtil.isEmpty(code)) {
			return 100;
		} else if(code.length()<3) {
			return 0;
		}
		String endCode = code.substring(code.length()-3);
		return Integer.parseInt(endCode)+1;
	}

}
