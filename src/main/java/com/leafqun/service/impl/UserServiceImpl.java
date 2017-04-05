package com.leafqun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.leafqun.entity.User;
import com.leafqun.mapper.UserMapper;
import com.leafqun.service.UserService;

public class UserServiceImpl implements UserService{

	

	@Autowired
	private UserMapper userMapper;

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public User selectByPrimaryKey(Integer userid) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(userid);
	}

}
