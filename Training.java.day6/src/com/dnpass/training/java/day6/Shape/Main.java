package com.dnpass.training.java.day6.Shape;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Shape :");
		String shape=sc.nextLine();
		System.out.println("Enter Radius :");
		int value=sc.nextInt();
		
		Circle c1 = new Circle(shape,value);
		c1.printArea();
		Square s1 = new Square("square1",10);
		s1.printArea();
		Rectangle r1 = new Rectangle("rectangle",7,8);
		r1.printArea();
}

}
