package com.baidu.rigel.ring.dto;

import java.util.Date;

import com.baidu.rigel.ring.bo.User;
import com.baidu.rigel.ring.utils.DateTimeUtils;

public class UserInfoDto {
	
	private Long id;
	private String name;
	private String phoneNum;
	private String sex;
	private Integer age;
	
	public UserInfoDto(){
		
	}
	
	public UserInfoDto(User user){
		this.id = user.getId();
		this.name = user.getName();
		this.phoneNum =user.getPhoneNumber();
		this.sex =  user.getSex() == null? "女" : user.getSex() ? "女":"男";
		this.age = DateTimeUtils.getAgeByBirthDay(user.getBirthday());
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
