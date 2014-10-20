package com.baidu.rigel.ring.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baidu.rigel.ring.dao.ConfigDao;
import com.baidu.rigel.ring.service.ConfigService;
import com.baidu.rigel.ring.service.UserService;


@Controller
@RequestMapping("/config")
public class ConfigController {
	
	@Resource
	private ConfigService configService;
	
	@RequestMapping("/set/{key}/{value}")
	@ResponseBody
	public String getUserInfo(@PathVariable String key,@PathVariable Long value){
		configService.setValue(key, value);
		return "success";
	}
}


