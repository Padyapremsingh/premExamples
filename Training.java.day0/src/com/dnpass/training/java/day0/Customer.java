package com.dnpass.training.java.day0;

public class Customer
{
	public String address="2-30,Amar Homes";
	public String billing_info="Shipped";
	public int age=21;
	public int custNumber=56826;
	public int orderNumber=122212;
	public String name="Premsingh Padya";
	//Methods
	public void displayCustomer()
	{
		System.out.println("Name : "+name);
	}
	
	public void requestDiscount()
	{
		System.out.println("Discount Requested By : "+name);
	}
	public void setAddress()
	{
		System.out.println("Address is : "+address);
	}
	public void shop()
	{
		System.out.println("Shop is X Store ");
	}
	
	
	
}