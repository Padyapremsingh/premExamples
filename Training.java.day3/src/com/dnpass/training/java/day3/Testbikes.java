package com.dnpass.training.java.day3;

		public class Testbikes {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Bicycle bike1 = new Bicycle(20,30,4);
				MotorBike bike2 = new MotorBike(10,20,2,"Dual");
				RoadBike bike3 = new RoadBike(20,10,3,23);
				
				bike1.printDescription();
				bike2.printDescription();
				bike3.printDescription();

			}

	}
