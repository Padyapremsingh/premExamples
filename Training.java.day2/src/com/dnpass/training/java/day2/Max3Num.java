package com.dnpass.training.java.day2;

import java.util.Scanner;

public class Max3Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.println("Enter the Value of A : ");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter the Value of B : ");
		b=sc.nextInt();
		System.out.println("Enter the Value of C : ");
		c=sc.nextInt();
		sc.close();
		if(a>b && a>c)
		{
			System.out.println("Entered Value of A : "+a);
			System.out.println(" is Bigger ");
			
		}
		else if(b>a && b>c)
		{
			System.out.println("Entered Value of B : "+b);
			System.out.println(" is Bigger ");
		
		}
		else
		{
			System.out.println("Entered Value of C : "+c);
			System.out.println(" is Bigger ");
				
		}
	
	}

}
