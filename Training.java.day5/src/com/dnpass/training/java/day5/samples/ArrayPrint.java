package com.dnpass.training.java.day5.samples;
import java.util.Scanner;
public class ArrayPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array :");
		int arrayLen=sc.nextInt();
		int[] array1=new int[arrayLen];
		for(int i=0;i<arrayLen;i++)
		{
			System.out.print("Enter Element "+(i+1)+" :");
			array1[i]=sc.nextInt();
		}
		//print array using for loop
		for(int i:array1)
		{
			System.out.println(i);
		}
	}

}
