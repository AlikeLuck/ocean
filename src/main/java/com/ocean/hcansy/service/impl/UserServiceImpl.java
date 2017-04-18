package com.ocean.hcansy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ocean.hcansy.dao.UserMapper;
import com.ocean.hcansy.entity.User;
import com.ocean.hcansy.service.UserService;

/**
 * 用户信息业务逻辑层实现类
 * @author yunhai
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User login(User user) {
		return userMapper.login(user);
	}

	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}

}
