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
	
	/**
	 * 查询单个用户信息
	 * @return
	 */
	User findOne(Long id);
	
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	int add(User user);
	
	/**
	 * 用户信息修改
	 * @param user
	 * @return
	 */
	int update(User user);
	
	/**
	 * 修改用户登录密码
	 * @param id
	 * @param newPassword
	 * @return
	 */
	int updatePassword(Long id, String newPassword);
}
