package com.ocean.hcansy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ocean.hcansy.entity.User;
import com.ocean.hcansy.service.UserService;

/**
 * 用户信息控制跳转层
 * @author yunhai
 *
 */
@RestController
public class UserController {
	
	@Autowired
	private UserService service;

	@RequestMapping("/findUser")
	public List<User> index() {
		return service.findAll();
	}
}
