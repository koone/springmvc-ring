package com.baidu.rigel.ring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class MainController  {
	
	@RequestMapping("/index")
	public String index() {
		System. out .println( "wildcard------------" );
		return "index";
	}

}
