package com.dnpass.training.java.day6.FindErrors;

public class OOPExercises1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstClass objA = new FirstClass();
		SecondClass objB = new SecondClass();
		System.out.println("in main(): ");
		System.out.println("objA.a = "+objA.getFirstClass());
		System.out.println("objB.b = "+objB.getSecondClass());
		objA.setFirstClass (222);
		objB.setSecondClass (333.33);
		System.out.println("objA.a = "+objA.getFirstClass());
		System.out.println("objB.b = "+objB.getSecondClass());

	}

}
