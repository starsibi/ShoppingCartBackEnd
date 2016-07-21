package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.User;

public class UserTest {
	public static void main(String[] args) {
		
	
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.niit.shoppingcart");
	context.refresh();
	UserDAO userDAO=(UserDAO)context.getBean("userDAO");
	User user=(User)context.getBean("user");
	System.out.println("values");
	user.setId("CG111");
	user.setName("Mobile");
	user.setPassword("niit");
	user.setMob("9677690163");
	user.setMail("starsibi@gmail.com");
	user.setAdd("Chennai");
	userDAO.saveOrUpdate(user);
	System.out.println("tanx");
	}

}
