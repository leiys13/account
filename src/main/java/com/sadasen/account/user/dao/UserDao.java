package com.sadasen.account.user.dao;

import org.beetl.sql.core.mapper.BaseMapper;

import com.sadasen.account.user.dto.UserDto;
import com.sadasen.account.user.entity.User;

/**
 * @date 2018年1月9日
 * @author lei.ys
 * @desc
 */
public interface UserDao extends BaseMapper<User> {
	
	public User findToLogin(UserDto userDto);

}
