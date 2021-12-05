package com.dnpass.training.java.day1;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3,b=5;
		for(int i=1;i<=100;i++)
		{
			if(i%a==0)
			{
				System.out.println(+i+"Fizz");
			}
			if(i%b==0)
			{
				System.out.println(+i+"Buzz");
				
			}
		}

	}

}
