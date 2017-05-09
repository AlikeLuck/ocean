package com.ocean.hcansy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

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
    
    /**
     * 根据用户Id查询单个用户信息
     * @param id 用户ID
     * @return
     */
    User findOne(Long id);
    
    /**
     * 用户添加
     * @param user
     * @return
     */
    int insert(User user);
    
    /**
     * 用户修改
     * @param user
     * @return
     */
    int update(User user);
    
    /**
     * 修改密码
     * @param id
     * @param password
     * @return
     */
    int updatePassword(@Param("id")Long id, @Param("password")String newPassword);
    
    /**
     * 删除用户信息
     * @param id
     * @return
     */
    int delete(Long id);
}