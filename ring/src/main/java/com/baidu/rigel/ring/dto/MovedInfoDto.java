package com.baidu.rigel.ring.dto;

import com.baidu.rigel.ring.utils.DateTimeUtils;
import com.baidu.rigel.ring.vo.MovedInfoVo;

public class MovedInfoDto {
	
	private Long userId;
	private String name;
	private String sex;
	private String phoneNum;
	private Float heartRate;
	private Integer age;
	
	public MovedInfoDto(){
	}
	
	public MovedInfoDto(MovedInfoVo infoVo){
		this.userId = infoVo.getUserId();
		this.name = infoVo.getName();
		this.phoneNum = infoVo.getPhoneNum();
		this.heartRate = infoVo.getHeartRate();
		this.sex = infoVo.getSex() == null? "女" : infoVo.getSex() ? "女":"男";
		this.age = DateTimeUtils.getAgeByBirthDay(infoVo.getBirthDay());
	}
	
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
