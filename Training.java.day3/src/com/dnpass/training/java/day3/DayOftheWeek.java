package com.dnpass.training.java.day3;
import java.util.*;
public class DayOftheWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int monthNumber;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Month Number : ");
		monthNumber=sc.nextInt();
		sc.close();
		String month;
		switch(monthNumber)
		{
		case 1:
			month="January";
			System.out.println("Month is : "+month);
			break;
		case 2:
			month="Feb";
			System.out.println("Month is : "+month);
			break;
		case 3:
			month="March";
			System.out.println("Month is : "+month);
			break;
		case 4:
			month="April";
			System.out.println("Month is : "+month);
			break;
		case 5:
			month="May";
			System.out.println("Month is : "+month);
			break;
		case 6:
			month="June";
			System.out.println("Month is : "+month);
			break;
		case 7:
			month="July";
			System.out.println("Month is : "+month);
			break;
		case 8:
			month="August";
			System.out.println("Month is : "+month);
			break;
		case 9:
			month="September";
			System.out.println("Month is : "+month);
			break;
		case 10:
			month="October";
			System.out.println("Month is : "+month);
			break;
		case 11:
			month="November";
			System.out.println("Month is : "+month);
			break;
		case 12:
			month="december";
			System.out.println("Month is : "+month);
			break;
		default:
			System.out.println("Entered Month Number Has No Month ... ! We are Sorry ): ");
			break;
					
			
		}
	}

}
