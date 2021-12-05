package com.dnpass.training.java.day4.Sample;

import java.util.Scanner;
import java.util.Arrays;
public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] array1=new int[10];
		
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter Element "+(i+1)+" :");
			array1[i]=sc.nextInt();
		}
		System.out.println("Element to be found :");
		int flag=0,find=sc.nextInt();
		for(int i=0;i<10;i++) {
			if(find==array1[i])
			{
				flag=1;
				break;		
			}
		}
		if(flag==1)
			System.out.println(find+" is found");
		else
			System.out.println(find+" not found");
	}
	

}
