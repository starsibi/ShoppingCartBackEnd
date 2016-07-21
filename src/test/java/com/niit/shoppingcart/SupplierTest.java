package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		
	
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.niit.shoppingcart");
	context.refresh();
	SupplierDAO supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
	Supplier supplier=(Supplier)context.getBean("supplier");
	System.out.println("values");
	supplier.setId("CG111");
	supplier.setName("Mobile");
	supplier.setDescription("best mobile phone");
	supplierDAO.saveOrUpdate(supplier);
	System.out.println("tanx");
	}

}
