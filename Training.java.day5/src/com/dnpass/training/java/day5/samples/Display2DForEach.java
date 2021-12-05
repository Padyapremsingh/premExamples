package com.dnpass.training.java.day5.samples;

public class Display2DForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [][] arrayNumber2d = {{1,2,3},{4,5,6}};
			for(int array[]:arrayNumber2d)
			{
				for(int elements : array)
				{
					System.out.println(elements+" ");
				}
				System.out.println();
			}
	}

}