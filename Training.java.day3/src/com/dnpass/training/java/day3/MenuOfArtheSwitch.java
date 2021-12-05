package com.dnpass.training.java.day3;

import java.util.Scanner;

public class MenuOfArtheSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int choose;
			Scanner sc=new Scanner(System.in);
			System.out.println("Type 1 for Addition ");
			System.out.println("Type 2 for Subtraction ");
			System.out.println("Type 3 for Multiplication ");
			System.out.println("Type 4 for Division ");
			System.out.println("Type Any Number Rather than mentioned above to Exit ");
			System.out.println("Choose an Option : ");
			choose=sc.nextInt();
			int a,b;
			System.out.println("ENter the Number 1 : ");
			a=sc.nextInt();
			System.out.println("ENter the Number 2 : ");
			b=sc.nextInt();
			sc.close();
			if(choose==1 || choose==2 || choose==3 || choose ==4)
			{
				System.out.println("Welcome to Menu : ");
				if(choose==1)
				{
					int c=a+b;
					System.out.println("Addition of A = "+a+" & "+b+" = "+c);
				}
				if(choose==2)
				{
					int c=a-b;
					System.out.println("Subtraction of A = "+a+" & "+b+" = "+c);
				}
				if(choose==3)
				{
					int c=a*b;
					System.out.println("Multiplication of A = "+a+" & "+b+" = "+c);
				}
				if(choose==4)
				{
					int c=a/b;
					System.out.println("Division of A = "+a+" & "+b+" = "+c);
				}
			}
			else if(choose>=5)
			{
					System.out.println("Thanks .... Visit Again ..!");
			}
	}

}
