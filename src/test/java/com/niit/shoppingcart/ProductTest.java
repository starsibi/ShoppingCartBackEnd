package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Product;

public class ProductTest {
	public static void main(String[] args) {
		
	
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.niit.shoppingcart");
	context.refresh();
	ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");
	Product product=(Product)context.getBean("product");
	System.out.println("values");
	product.setId("CG111");
	product.setName("Mobile");
	product.setDescription("best mobile phone");
	productDAO.saveOrUpdate(product);
	System.out.println("tanx");
	}

}
