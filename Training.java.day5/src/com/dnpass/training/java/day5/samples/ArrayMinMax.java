package com.dnpass.training.java.day5.samples;

import java.util.Scanner;

public class ArrayMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array :");
		int max=0,min=999,arrayLen=sc.nextInt();
		int[] array1=new int[arrayLen];
		for(int i=0;i<arrayLen;i++)
		{
			System.out.print("Enter Element "+(i+1)+" :");
			array1[i]=sc.nextInt();
		}
		for(int i=0;i<arrayLen;i++)
		{
			if(max<array1[i])
				max=array1[i];
			if(min>array1[i])
				min=array1[i];
		}
		System.out.println("min :"+min+"\tmax :"+max);
	}

}
