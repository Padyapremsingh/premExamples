package com.dnpass.training.java.day1;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b=0,flag=0;
		Scanner premsingh = new Scanner(System.in);
		System.out.println("Enter the Value of A : ");
		a=premsingh.nextInt();
		premsingh.close();
		if(a==0||a==1)
		{
			System.out.println(a+" is not a Prime Number ");
			
		}
		else
		{
			for(int i=2;i<=b;i++)
			{
				if(a%i==0)
				{
					System.out.println(a+" is not a Prime Number ");
					flag=1;
					break;
					
				}
			}
			if(flag==0)
			{
				System.out.println(a+" is a Prime Number ");
			}
		}

	}

}
