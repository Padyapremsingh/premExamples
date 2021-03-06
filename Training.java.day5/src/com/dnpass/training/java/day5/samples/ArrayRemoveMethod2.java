package com.dnpass.training.java.day5.samples;

import java.util.Scanner;

public class ArrayRemoveMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array :");
		int find, arrayLen = sc.nextInt();
		int[] array1 = new int[arrayLen];
		for (int i = 0; i < arrayLen; i++) {
			System.out.print("Enter Element " + (i + 1) + " :");
			array1[i] = sc.nextInt();
		}
		System.out.print("Enter Element to find :");
		find = sc.nextInt();
		
		// Check element in array using for loop
		for (int i = 0; i < arrayLen; i++) {
			if (array1[i] == find) {
				System.out.println( "Element "+find+" found");
				removeElement(i, array1,arrayLen);
				array1[arrayLen - 1] = 0;
				arrayLen--;
				i--;
			}
		}
		
		//print array
		if (arrayLen == 0) {
			System.out.println("Array Empty");
		} else {
			for (int i = 0; i < arrayLen; i++) {
				System.out.print(array1[i] + "\t");
			}
		}

	}

	private static void removeElement(int index, int[] array1,int arrayLen) {
		if (index == arrayLen - 1) {
			System.out.println(" 0 ");
		} else {
			for (int i = index; i < arrayLen; i++) {
				array1[i] = array1[i + 1];
			}
		}
	}

}
