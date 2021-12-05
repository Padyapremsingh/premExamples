package com.dnpass.training.java.day6;

public class StringCompareUsing3Ways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Prem";
		String s2="Rrem";
		String s3 = new String("Prem");
		
		//Compare by Using equals() method
		//1. By public boolean equals(Object another)
		System.out.println("By Using the equals() method");		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		//2. By equals(other String )
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		//Using == Operator .... Compare
		System.out.println("By Using the == Operator");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		//Using CompareTo
		System.out.println("By Using the compareTo() Method");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s2.compareTo(s3));
		
	}

}
