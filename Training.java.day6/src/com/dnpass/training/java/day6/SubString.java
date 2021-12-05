package com.dnpass.training.java.day6;
import java.util.*;
public class SubString {
		public static void main(String [] args)
		{
			String s="KandhaGadda 10 Rupalaki Kila";
			System.out.println("Using the substring(Initial Index Method)");
			System.out.println("Sub String of Kandha Gadda Is : "+s.substring(5));
			
			System.out.println("Using the substring(Initial Index, final Index Method)");
			System.out.println("Sub String of Kandha Gadda Is : "+s.substring(2, 10));
		//	System.out.println("Using Split Method");
	        //String text= new String("Hello, My name is Sachin");  
	        /* Splits the sentence by the delimeter passed as an argument */  
	      //  String[] split = s.split(" ",0);  
	        //  for(String ss:split)
	          //{
	        	//  System.out.println(ss);
	          //}
			int j=7;
			System.out.println("Value of J is : "+j);
			j++;
			System.out.println("Value of J is : "+j);
			int c=10-2+3*8/j-1;
			System.out.println("Value of C is : "+c);
			
		}
}
