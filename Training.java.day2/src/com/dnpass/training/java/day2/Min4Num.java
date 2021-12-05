package com.dnpass.training.java.day2;

import java.util.Scanner;

public class Min4Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		System.out.println("Enter the Value of A : ");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter the Value of B : ");
		b=sc.nextInt();
		System.out.println("Enter the Value of C : ");
		c=sc.nextInt();
		System.out.println("Enter the Value of D : ");
		d=sc.nextInt();
		sc.close();
		if(a<b && a<c && a<d)
		{
			System.out.println("Entered Value of A : "+a);
			System.out.println(" is Smaller ");
			
		}
		else if(b<a && b<c && b<d)
		{
			System.out.println("Entered Value of B : "+b);
			System.out.println(" is Smaller ");
		
		}
		else if(c<a && c<b &&  c<d)
		{
			System.out.println("Entered Value of C : "+c);
			System.out.println(" is Smaller ");
				
		}
		else
		{
			System.out.println("Entered Value of D : "+d);
			System.out.println(" is Smaller ");
		
		}
	}

}
