package com.baidu.rigel.ring.vo;

import java.util.Date;

public class MovedInfoVo {
	
	private Long userId;
	private String name;
	private Boolean sex;
	private String phoneNum;
	private Float heartRate;
	private Date birthDay;
	private Float localX;
	private Float localY;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getSex() {
		return sex;
	}
	public void setSex(Boolean sex) {
		this.sex = sex;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public Float getHeartRate() {
		return heartRate;
	}
	public void setHeartRate(Float heartRate) {
		this.heartRate = heartRate;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public void setLocalX(Float localX) {
		this.localX = localX;
	}
	public Float getLocalX() {
		return localX;
	}
	public void setLocalY(Float localY) {
		this.localY = localY;
	}
	public Float getLocalY() {
		return localY;
	}
	
}
