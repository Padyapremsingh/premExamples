package com.dnpass.training.java.day0;
import java.util.*;
public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Value of A : ");
			a=sc.nextInt();
			int b;
			System.out.println("Enter the Value of B : ");
			b=sc.nextInt();
			if(a>1 && a<10)
			{
				if(b>1 && b<10)
				{
					System.out.println("Entered Value of A & B in between 1 & 10 ");
				}
				
			}
			else if(a<1 && a>-10)
			{
			 if(b<1 && b>-10)
				{
					System.out.println("Entered Value of A & B in between 0 & -10 ");
				}
			}
			else if(a<-10)
			{
				if(b<-10)
				{
					System.out.println("Entered Value of A & B in Below -10 ");
					
				}
				
			}
			else
			{
				System.out.println("None ");
				
				
			}
			
	}

}
