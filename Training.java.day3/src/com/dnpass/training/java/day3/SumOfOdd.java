package com.dnpass.training.java.day3;
import java.util.*;
public class SumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int lowerlimit=0,upperlimit;
			int a=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Value of Lower Limit  : ");
			lowerlimit=sc.nextInt();
			System.out.println("Enter the Value of Upper Limit : ");
			upperlimit=sc.nextInt();
			sc.close();
			while(lowerlimit<upperlimit)
			{
				if(lowerlimit%2!=0)
				{
					
				System.out.println("Value is : "+lowerlimit);
				
				}
				lowerlimit++;
				
			}
			a+=lowerlimit;
			System.out.println("Result of Sum is : "+a);

			
	}

}
