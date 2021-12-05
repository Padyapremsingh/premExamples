package com.dnpass.training.java.day5.samples;

import java.util.Scanner;

public class ArrayRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array :");
		int j = 0, count = 0, find, arrayLen = sc.nextInt();
		int[] array1 = new int[arrayLen], array2 = new int[arrayLen];
		for (int i = 0; i < arrayLen; i++) {
			System.out.print("Enter Element " + (i + 1) + " :");
			array1[i] = sc.nextInt();
		}
		System.out.print("Enter Element to Remove :");
		find = sc.nextInt();
		// Check element in array using for loop
		for (int i = 0; i < arrayLen; i++) {
			if (array1[i] != find) {
				array2[j] = array1[i];
				j++;
			}
		}
		if (j == 0)
			System.out.println("Array Empty");
		else {
			for (int i = 0; i < j; i++) {
				System.out.println(array2[i]);
			}
		}
	}

}
