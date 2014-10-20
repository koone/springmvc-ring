package com.baidu.rigel.ring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestConfig {
	
	@Value("#{properties['ring.time.threshold']}")
	private  Long time ;
	
	@Value("#{properties['ring.distance.threshold']}")
	private float distance;

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
		System.out.println(distance);
	}

	public void setTime(Long time) {
		this.time = time;
		System.out.println(time);
	}

	public Long getTime() {
		return time;
	}
	
	
	
}
