package com.dnpass.training.java.day5.samples;

import java.util.Scanner;

public class ArrayFindElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array :");
		int find,arrayLen=sc.nextInt();
		int[] array1=new int[arrayLen];
		for(int i=0;i<arrayLen;i++)
		{
			System.out.print("Enter Element "+(i+1)+" :");
			array1[i]=sc.nextInt();
		}
		System.out.print("Enter Element to find :");
		find=sc.nextInt();
		//Check element in array using for loop
		block1:for(int i=0;i<arrayLen;i++)
		{
			if(array1[i]==find)
			{
				System.out.println("Element found");
				break block1;
			}

		}
	}
}
