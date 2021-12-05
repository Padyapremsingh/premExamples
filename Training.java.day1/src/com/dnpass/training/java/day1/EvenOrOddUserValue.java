package com.dnpass.training.java.day1;
import java.util.*;
public class EvenOrOddUserValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a;
			System.out.println("Enter the Input Value ...!  : ");
			Scanner sc = new Scanner(System.in);
			a=sc.nextInt();
			sc.close();
			int sum=0;
			while(a!=0)
			{	
			sum+=a%10;
			a = a/10;
			}	
			
			if(sum%2==0)
			{
				
				System.out.println("Value of Sum of Input Value is  ...!  : "+sum);
				System.out.println("Value is Even  ...!   ");

			}
			else
			{
				System.out.println("Value of Sum of Input Value is  ...!  : "+sum);
				System.out.println("Value is odd  ...!   ");

			}
			
	}

}