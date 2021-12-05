package com.dnpass.training.java.day1;
import java.util.Scanner;
public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=5,b=8,c=6;
		int total;
		total = a+b*c;
		int total1, total2,total3;
		total1=(a+b)%c;
		int d=20;
		total2=a+(-b*c)/d;
		total3=a+b/c*d-c%d;
		System.out.println("The Total Value is : "+total);
		System.out.println("The Total Value is : "+total1);
		System.out.println("The Total Value is : "+total2);
		System.out.println("The Total Value is : "+total3);
		*/
		//using scanner Class
		int a,b,c,d;
		int total1, total2,total3,total4;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value of A : ");
		a=sc.nextInt();		
		System.out.println("Enter the Value of B : ");
		b=sc.nextInt();
		System.out.println("Enter the Value of C : ");
		c=sc.nextInt();
		System.out.println("Enter the Value of D : ");
		d=sc.nextInt();
		sc.close();
		total1 = (-a)+b*c;
		total2 = (-a+b)%c;
		total3=a+(b*c)/d;
		total4=a+b/c*b-d%c;
		System.out.println("The Total Value is : "+total1);
		System.out.println("The Total Value is : "+total2);
		System.out.println("The Total Value is : "+total3);
		System.out.println("The Total Value is : "+total4);

	}

}
