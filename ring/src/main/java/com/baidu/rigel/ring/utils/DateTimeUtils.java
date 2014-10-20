package com.baidu.rigel.ring.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtils {
	
	/**时间相加
	 * @param domain 原时间
	 * @param milSecond 需要相加的时间
	 */
	public static Date calculate (Date domain, Long milSecond){
		Date newDate = new Date();
		newDate.setTime(domain.getTime()+milSecond);
		return newDate;
	}

	public static Integer getAgeByBirthDay(Date birthDay){
		Long diff = new Date().getTime() - birthDay.getTime();
		long unit = 24*60*60*1000*365L;
		Integer age = (int) (diff/unit)+1;
		return age;
	}
	
	public static void main(String[] args) throws ParseException {
		Date birth = new SimpleDateFormat("yyyy-MM-dd").parse("2013-10-01");
		System.out.println(getAgeByBirthDay(birth));
	}
	
}
