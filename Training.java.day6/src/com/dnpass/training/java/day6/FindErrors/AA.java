package com.dnpass.training.java.day6.FindErrors;

public class AA {
	int a = 100;
	// a is declared in private change it to public because OOPExercise 
	//is using a. if declared private,it is visible only within the class.
	public void setA( int value) {
	a = value;
	}

	public int getA() {
	return a;
	}

}
