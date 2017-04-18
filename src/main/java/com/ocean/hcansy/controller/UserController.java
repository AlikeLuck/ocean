package com.ocean.hcansy.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ocean.hcansy.entity.User;
import com.ocean.hcansy.service.UserService;

/**
 * 用户信息控制跳转层
 * @author yunhai
 *
 */
@Controller
public class UserController {
	
	private final static Logger LOG = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService service;

	@RequestMapping("/findUser")
	@ResponseBody
	public List<User> index() {
		return service.findAll();
	}
	
	@RequestMapping("/login.html")
    public String login(HttpSession session) {
        if (session.getAttribute("USERINFO") != null) {
            LOG.info("用户已登录，跳转到首页！");
            return "redirect:/index.html";
        }
        LOG.info("进入登录页面");
        return "login";
    }
}
