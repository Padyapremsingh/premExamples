package com.dnpass.training.java.day0;
import java.util.*;
public class LoopsFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//For each Name in the Names array
		String [] names=new String[10];
		names[0]="Prem";
		names[1]="Vijay";
		names[2]="Jeevan";
		for(String name:names)//name is the place holder
		{
			System.out.println("Name is " +name);
		}
		int i;
		System.out.println("Enter Total number of Students...!  : ");
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		int totalStudents[] = new int[size];
		System.out.println("Enter the Marks of Each Student : ");
		for( i=0;i<size;i++)
		{
			System.out.println("Marks of the Candidate "+i+"is : " );
			totalStudents[i]=sc.nextInt(); 
			System.out.println("Marks of Student "+i+" is"+totalStudents[i]);
			
		}
		
		
		
		
		
		/*System.out.println("Enter the Marks of the Student1 : ");
		marksofStudents[0]=sc.nextInt();
		System.out.println("Entered the Marks of the Student1 is : "+marksofStudents[0]);
		System.out.println("Enter the Marks of the Student2 : ");
		marksofStudents[1]=sc.nextInt();
		System.out.println("Entered the Marks of the Student2 is : "+marksofStudents[1]);
		System.out.println("Enter the Marks of the Student3 : ");
		marksofStudents[2]=sc.nextInt();
		System.out.println("Entered the Marks of the Student3 is : "+marksofStudents[2]);
		System.out.println("Enter the Marks of the Student4 : ");
		marksofStudents[3]=sc.nextInt();
		System.out.println("Entered the Marks of the Student4 is : "+marksofStudents[3]);
		*/
		
	}

}
