package com.dnpass.training.java.day3;
import java.util.*;
public class OddNumberDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int upperodd;
		int lowerodd=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Upper Limit : ");
		upperodd = sc.nextInt();
		//System.out.println("Enter Lower Limit : ");
		//lowerodd = sc.nextInt();
		do
		{
			
			if(lowerodd%2!=0)
			{
			System.out.println("Value is : "+lowerodd);
			}
			/*
			if(lowerodd%2==0)
			{
				continue;
			}
			System.out.println("Value is : "+lowerodd);*/
			lowerodd++;
		}//while(lowerodd<=100);
		while(lowerodd<=upperodd);
		
		
	}

}
