package com.baidu.rigel.ring.dao;

import com.baidu.rigel.ring.bo.User;

public interface UserDao {
	
	public User findUserById(Long Id);

	public User findUserByName(String name);
	
}
