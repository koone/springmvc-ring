package com.baidu.rigel.ring.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.baidu.rigel.ring.config.RingConfig;
import com.baidu.rigel.ring.dao.ConfigDao;
import com.baidu.rigel.ring.service.ConfigService;

@Service("configService")
public class ConfigServiceImpl implements ConfigService {

	@Resource(name="configDao")
	public ConfigDao configDao;
	
	@Override
	public void setValue(String key, Long value) {
		configDao.updateValueBykey(key, value);
		RingConfig.setConfigCache(key, value);
	}

}
