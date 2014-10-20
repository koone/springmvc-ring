package com.baidu.rigel.ring.dao;

import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.baidu.rigel.ring.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:conf/ApplicationContext.xml")
public class UserDaoTest {
	
	@Resource
	public UserService userService;
	
	@Test
	public void testFindUserById(){
		System.out.println(userService.findUserById(1L));
	}
}
