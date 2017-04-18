package com.ocean.hcansy.dao;

import java.util.List;

import com.ocean.hcansy.entity.User;

/**
 * 用户信息数据访问层
 * @author yunhai
 *
 */
public interface UserMapper {

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