package com.ocean.hcansy.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {

    private final static Logger LOG = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping("/index.html")
    public String login() {
        LOG.info("进入首页");
        return "index";
    }

    @RequestMapping("/home.html")
    public String home(ModelMap map) {
        LOG.info("进入主页");
        map.addAttribute("productList", null);
        map.addAttribute("home", null);
        map.addAttribute("chartList", null);
        return "home";
    }
}
