package com.ocean.hcansy.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ocean.hcansy.common.CommonResponse;
import com.ocean.hcansy.common.MessageAndCode;
import com.ocean.hcansy.entity.User;
import com.ocean.hcansy.service.UserService;

/**
 * 用户信息控制跳转层
 * @author yunhai
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	private final static Logger LOG = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService service;

	@RequestMapping("/find/all")
	@ResponseBody
	public CommonResponse findAll() {
		return new CommonResponse(service.findAll());
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
	
	@GetMapping("/index.html")
    public String index(ModelMap map) {
		List<User> userList = service.findAll();
		map.addAttribute("userList", userList);
		return "user";
	}
	
	@RequestMapping("/find/one")
	@ResponseBody
	public CommonResponse findOne(Long id) {
		return new CommonResponse(service.findOne(id));
	}
	
	@RequestMapping("/insert")
	@ResponseBody
	public CommonResponse insert(HttpSession session, User user) {
		CommonResponse cr = new CommonResponse();
		User u = (User) session.getAttribute("USERINFO");
		if(u.getRose() != null) {
			int rose = u.getRose();
			int addRose = user.getRose();
			if(rose == 1 || rose < addRose) {
				cr.setData(service.add(user));
				return cr;
			}
		}
		cr.setMessageAndCode(MessageAndCode.NO_PERMISSION);
		return cr;
	}
}
