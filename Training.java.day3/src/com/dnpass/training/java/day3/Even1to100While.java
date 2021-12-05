package com.dnpass.training.java.day3;
import java.util.*;
public class Even1to100While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int upperlimit;
		System.out.println("Enter the Limit till which you need to perform the Even Operation .... ! : ");
		Scanner obj = new Scanner(System.in);
		upperlimit=obj.nextInt();
		obj.close();
		System.out.println("Upper Limit you have set for the Even Operation .... ! : "+upperlimit);
		int lowerlimit=2;
		System.out.println("Lower Limit you have set for the Even Operation .... ! : "+lowerlimit);
		while(lowerlimit<=upperlimit)
		{
			System.out.println(" Value is : "+lowerlimit);
			lowerlimit=lowerlimit+2;
			}
	}

}
