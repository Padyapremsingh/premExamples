package com.dnpass.training.java.day4;

import java.util.Scanner;

public class Smallest3Numbers {

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
		if(a<b && a<c )
		{
			System.out.println("Entered Value of A : "+a);
			System.out.println(" is Smaller ");
			
		}
		else if(b<a && b<c )
		{
			System.out.println("Entered Value of B : "+b);
			System.out.println(" is Smaller ");
		
		}
		else
		{
			System.out.println("Entered Value of C : "+c);
			System.out.println(" is Smaller ");
				
		}
		
	}

}
