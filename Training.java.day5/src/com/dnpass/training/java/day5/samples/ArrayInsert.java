package com.dnpass.training.java.day5.samples;

import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array :");
		int  find,insert, arrayLen = sc.nextInt();
		int[] array1 = new int[arrayLen], array2 = new int[arrayLen];
		for (int i = 0; i < arrayLen; i++) {
			System.out.print("Enter Element " + (i + 1) + " :");
			array1[i] = sc.nextInt();
		}
		System.out.print("Enter Position to Insert :");
		find = sc.nextInt();
		System.out.print("Enter Element to Insert :");
		insert = sc.nextInt();
		
		for(int i=0;i<arrayLen;i++)
		{
			if(i==find-1)
			{
				System.out.println("Element Replaced :"+i);
				array1[i]=insert;
			}

		}
		for(int i:array1)
		{
			System.out.print(i+"\t");
		}
	}

}
