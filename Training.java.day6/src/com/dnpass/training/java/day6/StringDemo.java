package com.dnpass.training.java.day6;

public final class StringDemo {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
			//char[] ch = {'p','r','e','m'};
			//String s=new String(ch.toString(ch));
			//System.out.println(s);
			String s="Prem SIngh Padya ";
			s.concat("is a Good Boy. ");
			System.out.println(s);
			//Since Strings are immutable
			//Once you initialize that will no longer gets concatinated.
			//if explicitly we refer we can concatinate
			String z=s.concat(" is a Good Boy..! ");
			System.out.println(z);
	}	

}
