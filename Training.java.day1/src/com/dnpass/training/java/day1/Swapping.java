package com.dnpass.training.java.day1;
import java.util.*;
public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner premsingh = new Scanner(System.in);
		System.out.println("Enter the Value of A : ");
		a=premsingh.nextInt();
		System.out.println("Enter the Value of B : ");
		b=premsingh.nextInt();
		premsingh.close();
		System.out.println("Before Swapping Value of A is : "+a);
		System.out.println("Before Swapping Value of B is : "+b);
		//c=a;
		//a=b;
		//b=c;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping Value of A is : "+a);
		System.out.println("After Swapping Value of B is : "+b);
	}

}
