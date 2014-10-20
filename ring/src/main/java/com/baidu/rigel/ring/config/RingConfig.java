package com.baidu.rigel.ring.config;

import java.util.HashMap;
import java.util.Map;


public class RingConfig {
	
	//@Value("#{properties['ring.time.threshold']}")
	public static Long RING_TIME_THRESHOLD = 30*1000L;
	
	//@Value("#{properties['ring.distance.threshold']}")
	public static Long RING_DISTANCE_THRESHOLD = 50L;
	
	public static Map<String, Long> configCache = new HashMap<String,Long>(2);
	
	static{
		setConfigCache("time",RingConfig.RING_TIME_THRESHOLD);
		setConfigCache("distance",RingConfig.RING_DISTANCE_THRESHOLD);
	}
	
	public static void setConfigCache(String key, Long value){
		configCache.put(key, value);
	}
}
