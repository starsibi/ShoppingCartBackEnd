package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;

public class CategoryTest {
	public static void main(String[] args) {
		
	
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.niit.shoppingcart");
	context.refresh();
	CategoryDAO categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
	Category category=(Category)context.getBean("category");
	System.out.println("values");
	category.setId("CG111");
	category.setName("Mobile");
	category.setDescription("best mobile phone");
	categoryDAO.saveOrUpdate(category);
	System.out.println("tanx");
	}

}
