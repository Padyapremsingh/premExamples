package com.dnpass.training.java.day1;
import java.util.*;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,average;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Value of A : ");
		a=sc.nextInt();
		System.out.println("Enter the Value of B : ");
		b=sc.nextInt();
		average=(a+b)/2;
		sc.close();
		System.out.println("Average Value is  : "+average);		
	}

}
