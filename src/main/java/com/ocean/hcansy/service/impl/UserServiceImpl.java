package com.ocean.hcansy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ocean.hcansy.common.utils.Md5Utils;
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
		user.setPassword(Md5Utils.hash(user.getPassword()));
		return userMapper.login(user);
	}

	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}
	
	@Override
	public User findOne(Long id) {
		return userMapper.findOne(id);
	}

	@Override
	public int add(User user) {
		user.setPassword(Md5Utils.hash(user.getPassword()));
		return userMapper.insert(user);
	}
	
	public int update(User user) {
//		user.setPassword(Md5Utils.hash(user.getPassword()));
		return userMapper.update(user);
	}

	@Override
	public int updatePassword(Long id, String newPassword) {
		return userMapper.updatePassword(id, Md5Utils.hash(newPassword));
	}

	@Override
	public int delete(Long id) {
		return userMapper.delete(id);
	}

}
