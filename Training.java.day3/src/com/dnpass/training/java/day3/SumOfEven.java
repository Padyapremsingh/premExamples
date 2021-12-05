package com.dnpass.training.java.day3;
import java.util.*;
public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=0;
			int i,n;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Upper Value of Loop : ");
			n=sc.nextInt();
			sc.close();
			for(i=0;i<=n;i++)
			{
				System.out.println("Value is : "+i);
				i++;
			}
			a+=i;
			System.out.println("Total Sum of Even Numbers is : "+a);
	}

}
