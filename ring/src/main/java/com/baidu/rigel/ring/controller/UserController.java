package com.baidu.rigel.ring.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baidu.rigel.ring.dto.UserInfoDto;
import com.baidu.rigel.ring.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private Logger log = Logger.getLogger(UserController.class);
	
	@Resource
	private UserService  userService;
	
	@RequestMapping("/info/{Id}")
	@ResponseBody
	public UserInfoDto getUserInfo(@PathVariable Long Id){
		return userService.findUserById(Id);
	}
	
	@RequestMapping("/login/{name}")
	@ResponseBody
	public UserInfoDto getUserInfo(@PathVariable String name){
		return userService.findUserByName(name);
	}
	
}
