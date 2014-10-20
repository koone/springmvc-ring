package com.baidu.rigel.ring.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.DeserializationConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baidu.rigel.ring.bo.Moved;
import com.baidu.rigel.ring.dto.MovedInfoDto;
import com.baidu.rigel.ring.service.MovedService;

@Controller
@RequestMapping("/moved")
public class MovedController {
	
	@Resource
	private MovedService movedService;
	
	@RequestMapping("/save")
	@ResponseBody
	public String saveMoved(@RequestParam String json){
		ObjectMapper mapper = new ObjectMapper();  
		mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		Moved moved = null;
		try {
			System.out.println(json);
			moved = mapper.readValue(json, Moved.class);
			moved.setMovedTime(new Date());
			movedService.saveMoved(moved);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return "SUCCESS";
	}
	
	@RequestMapping("/mapper")
	@ResponseBody
	public List<MovedInfoDto> getCloserMapper(@RequestParam Long userId, @RequestParam float localX, @RequestParam float localY){
		List<MovedInfoDto> movedInfoList = movedService.findCloserMovedUser(userId, localX, localY);
		return movedInfoList;
	}
}
