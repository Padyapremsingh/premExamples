package com.dnpass.training.java.day1;
import java.util.*;
public class Asciivalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a character: ");  
		Scanner premsingh = new Scanner(System.in);  
		char character = premsingh.next().charAt(0);  
		int asciiValue = character;  
		System.out.println("ASCII value of " +character+ " is: "+asciiValue);  
	}

}
