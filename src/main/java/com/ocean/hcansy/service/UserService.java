package com.ocean.hcansy.service;

import java.util.List;

import com.ocean.hcansy.entity.User;

/**
 * 用户信息业务逻辑层
 * @author yunhai
 *
 */
public interface UserService {

	/**
     * 用户登录
     * @param User user
     * @return User
     */
	User login(User user);
	
	/**
     * 用户查询
     * @return List<User>
     */
	List<User> findAll();
}
