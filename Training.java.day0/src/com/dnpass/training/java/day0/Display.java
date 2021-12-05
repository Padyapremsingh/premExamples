package com.dnpass.training.java.day0;

public class Display {

	public static void main(String [] args)
		{
			
			Customer c=new Customer();
			System.out.println(c.age);
			c.requestDiscount();
			c.setAddress();
			c.shop();
			c.displayCustomer();
		
		}
		
	}

