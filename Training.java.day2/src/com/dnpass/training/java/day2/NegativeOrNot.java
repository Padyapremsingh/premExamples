package com.dnpass.training.java.day2;
import java.util.*;
public class NegativeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("Enter the Value of A : ");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		if(a<0)
		{
			System.out.println("The Entered Value is "+a);
			System.out.println("& it is Negative Number...! ");
		}
		else
		{
			System.out.println("The Entered Value is "+a);
			System.out.println("& it is Positive Number...! ");
		
		}

	}

}
