package com.ocean.hcansy.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ocean.hcansy.common.CommonResponse;
import com.ocean.hcansy.common.MessageAndCode;
import com.ocean.hcansy.entity.Goods;
import com.ocean.hcansy.entity.User;
import com.ocean.hcansy.service.GoodsService;

/**
 * 商品信息控制访问层
 *
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {
	
	@Autowired
	private GoodsService service;

	@GetMapping("/index.html")
	public String index(ModelMap map) {
		List<Goods> list = service.findAll();
		map.addAttribute("goodsList", list);
		return "goods";
	}
	
	@RequestMapping("/findall")
	@ResponseBody
	public CommonResponse findAll(Goods goods) {
		CommonResponse cr = new CommonResponse(service.findAll());
		return cr;
	}
	
	@RequestMapping("/insert")
	@ResponseBody
	public CommonResponse insert(HttpSession session, Goods goods) {
		CommonResponse cr = new CommonResponse();
		User u = (User) session.getAttribute("USERINFO");
		if(u.getRose() != null) {
			if(u.getRose().intValue() == 1) {
				cr.setData(service.insert(goods));
				return cr;
			}
		}
		cr.setMessageAndCode(MessageAndCode.NO_PERMISSION);
		return cr;
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public CommonResponse update(HttpSession session, Goods goods) {
		CommonResponse cr = new CommonResponse();
		User u = (User) session.getAttribute("USERINFO");
		if(u.getRose() != null) {
			if(u.getRose().intValue() == 1) {
				cr.setData(service.update(goods));
				return cr;
			}
		}
		cr.setMessageAndCode(MessageAndCode.NO_PERMISSION);
		return cr;
	}
	
	@RequestMapping("/update/flag")
	@ResponseBody
	public CommonResponse updateFlag(HttpSession session, Long id, Integer flag) {
		CommonResponse cr = new CommonResponse();
		User u = (User) session.getAttribute("USERINFO");
		if(u.getRose() != null) {
			if(u.getRose().intValue() == 1) {
				cr.setData(service.updateFlag(id, flag));
				return cr;
			}
		}
		cr.setMessageAndCode(MessageAndCode.NO_PERMISSION);
		return cr;
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public CommonResponse delete(HttpSession session, Long id) {
		CommonResponse cr = new CommonResponse();
		User u = (User) session.getAttribute("USERINFO");
		if(u.getRose() != null) {
			if(u.getRose().intValue() == 1) {
				cr.setData(service.delete(id));
				return cr;
			}
		}
		cr.setMessageAndCode(MessageAndCode.NO_PERMISSION);
		return cr;
	}
	
}
