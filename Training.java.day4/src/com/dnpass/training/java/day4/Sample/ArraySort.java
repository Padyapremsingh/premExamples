package com.dnpass.training.java.day4.Sample;

import java.util.*;
public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] array1=new int[10];
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter Element "+(i+1)+" :");
			array1[i]=sc.nextInt();
		}
		Arrays.sort(array1);
		for(int i:array1) {
			System.out.println(i);
		}
	}

}
