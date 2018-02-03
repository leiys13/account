package com.sadasen.account.user.service;

import com.sadasen.account.user.dto.UserDto;
import com.sadasen.account.user.entity.User;

/**
 * @date 2018年1月9日
 * @author lei.ys
 * @desc
 */
public interface UserService {
	
	public User save(User user);
	
	public User findToLogin(UserDto userDto);
	
	public User findById(long id);
	
	public User getById(long id);

}
