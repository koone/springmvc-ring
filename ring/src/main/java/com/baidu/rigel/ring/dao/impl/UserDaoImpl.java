package com.baidu.rigel.ring.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baidu.rigel.ring.bo.User;
import com.baidu.rigel.ring.dao.UserDao;
import com.baidu.rigel.ring.dao.mapper.UserMapper;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	public UserMapper userMapper;
	
	@Override
	public User findUserById(Long Id) {
		return userMapper.selectByPrimaryKey(Id);
	}

	@Override
	public User findUserByName(String name) {
		return userMapper.selectByName(name);
	}

}
