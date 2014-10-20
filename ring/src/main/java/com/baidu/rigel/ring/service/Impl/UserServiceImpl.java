package com.baidu.rigel.ring.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.baidu.rigel.ring.bo.User;
import com.baidu.rigel.ring.dao.UserDao;
import com.baidu.rigel.ring.dto.UserInfoDto;
import com.baidu.rigel.ring.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Resource(name="userDao")
	public UserDao userDao;
	
	public UserInfoDto findUserById(Long Id){
		User user = userDao.findUserById(Id);
		return new UserInfoDto(user);
	}

	@Override
	public UserInfoDto findUserByName(String name) {
		System.out.println(name);
		User user = userDao.findUserByName(name);
		return new UserInfoDto(user);
	}

}