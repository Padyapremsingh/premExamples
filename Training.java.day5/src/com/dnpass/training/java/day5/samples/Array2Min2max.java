package com.dnpass.training.java.day5.samples;

import java.util.Scanner;

public class Array2Min2max {
	public static void main(String... args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array :");
		int max1=0,min1=999,max2=0,min2=999,arrayLen=sc.nextInt();
		int[] array1=new int[arrayLen];
		for(int i=0;i<arrayLen;i++)
		{
			System.out.print("Enter Element "+(i+1)+" :");
			array1[i]=sc.nextInt();
		}
		for(int i=0;i<arrayLen;i++)
		{
			if(max1<array1[i])
				max1=array1[i];
			if(min1>array1[i])
				min1=array1[i];
		}
		System.out.println("min :"+min1+"\tmax :"+max1);
		
		for(int i=0;i<arrayLen;i++)
		{
			if(max2<array1[i] && max1>array1[i])
				max2=array1[i];
			if(min2>array1[i] && min1<array1[i])
				min2=array1[i];
		}
		System.out.println("min :"+min2+"\tmax :"+max2);
	}
}
