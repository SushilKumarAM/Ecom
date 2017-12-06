package com.niit.backend;



import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.UserDAO;
import com.niit.model.User;

public class UserTest {
	
	static UserDAO userDao;
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext configApplnContext=new AnnotationConfigApplicationContext();
		configApplnContext.scan("com");
		configApplnContext.refresh();
		
		//SessionFactory sessionFactory=(SessionFactory)configApplnContext.getBean("DBConfig.class");
		
		userDao=(UserDAO)configApplnContext.getBean("UserDAO");
	}
	
	@Test
	public void addUserTest()
	{
		User user=new User();
		user.setUserName("hello");
		user.setEmailId("hgjhj");
		user.setAddress("hghh");
		user.setPassword("hgjhgj");
		user.setPhoneNumber(908767);
		user.setPincode(98789);
		user.setEnabled(true);
		assertTrue(userDao.addUser(user));
		
		
	}


}
