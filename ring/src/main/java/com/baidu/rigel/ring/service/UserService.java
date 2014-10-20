package com.baidu.rigel.ring.service;

import com.baidu.rigel.ring.dto.UserInfoDto;

public interface UserService {
	
	public UserInfoDto findUserById(Long Id);

	public UserInfoDto findUserByName(String name);
}
