package com.dnpass.training.java.day0;
import java.util.*;
import java.lang.Iterable;
public class BreakAndContinue {

	public static void main(String[] args) {
		/*
		int a,i;
		System.out.println("Enter the Number... ! : ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(i=0;i<=a;i++)
		{
			System.out.println(i);
			if(i==2)
			{
				System.out.println(" Continued at : "+i);
				continue;
			}
			if(i==a)
			{
				
				break;
			}
		}*/
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array  : ");
		n=sc.nextInt();
		int [] name=new int[n];
		int i;
		System.out.println("Enter the Numbers Upto ... ! : ");
		for(i=0;i<n;i++)
		{
			name[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			//display the array List Printed
			System.out.println("Entered Number at : "+"name["+i+"] is : "+name[i]);			
			
		}
		System.out.println("Done with 1D Array");			
		System.out.println("Let Us start 2D arrays...! ");			
		//It has 2 Indices
		//Rows and Cols
		int j,k;
		int x,y,z;
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the Rows of Array  : ");
		x=sc.nextInt();
		System.out.println("Enter the Columns of Array  : ");
		y=sc.nextInt();
		System.out.println("Enter the another Seq of Array  : ");
		z=sc.nextInt();
		int [][][] threeD=new int[x][y][z];
		System.out.println("Enter the Elements in the Array of   : threeD[ "+x+" ] [ "+y+"][ "+z+"]");
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				for(k=0;k<z;k++)
				{
					
		
				threeD[i][j][k]=sc1.nextInt();

				}
			}
		}
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				for(k=0;k<z;k++)
				{
				
				//Display
				System.out.println("Element in the Array of   : threeD[ "+i+" ] [ "+j+"][ "+k+"]  is : "+threeD[i][j][k]);
				
				}	
			}
		}
		
		
		
	}
}
		//positive Numbers
		//use for-each loop and break, continue stmts
		//Enter the Size of the Array 
		/*int size;
		System.out.println("Enter the Size of the Array ...!");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		int [] array=new int[size];
		System.out.println("Insert Positive Values ...!");
		for(int i=0;i<size;i++)
		{
			array[size]=sc.nextInt();
			System.out.println("Entered value is Positive ...!");
			if(array[size]<0)
			{
				System.out.println("Entered value is Negative ...!");
				continue;
			}
			if(array==0)
			{
				System.out.println("Entered value is Invalid ...!");
				break;
			}
			
			System.out.println("Entered value is Positive ...!");
			
		}
		
		kamalraj.krish

		
		int hoursNeeded = 5;
		int hoursAvailable = 5;
		int hoursRemaining;

		if(hoursAvailable > 0) {
		  hoursRemaining = hoursAvailable - hoursNeeded;
		  if(hoursRemaining < 0) {
			 System.out.println("Not enough time.");
		  } else {
		    String suffix = "";
		    if(hoursRemaining != 1) {
			    suffix = "s";
		    }

		    System.out.println("You will have " + hoursRemaining + " hour" + suffix + " remaining.");
		  }
		} else {
		 System.out.println("Times up.");
		}
*/
