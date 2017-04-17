package com.ocean.hcansy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //该注解的意思就是当前controller里面的方法都以json格式输出
public class HelloController {

	@RequestMapping("/hello")
	public String index() {
		return "Hello World~~";
	}
}
