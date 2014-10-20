package com.baidu.rigel.ring.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baidu.rigel.ring.dao.ConfigDao;
import com.baidu.rigel.ring.dao.mapper.ConfigMapper;

@Repository("configDao")
public class ConfigDaoImpl implements ConfigDao{
	
	@Autowired
	public ConfigMapper configMapper;

	@Override
	public void updateValueBykey(String key, Long value) {
		configMapper.updateValueBykey(key,value);
	}

}
