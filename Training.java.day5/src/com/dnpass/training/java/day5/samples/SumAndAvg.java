package com.dnpass.training.java.day5.samples;
import java.util.*;
public class SumAndAvg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int size,i;
		int[] array1;
		int[] array2;
		int[] add;
		int[] sub;
		int[] mul;
		float[] div;
		System.out.println("Enter the Size of An Array : ");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		sc.close();
		System.out.println("Size of the Array is : "+size);
		System.out.println("Enter the Elements of 1st Array : ");
		for(i=0;i<size;i++)
		{
			array1[i]=sc.nextInt();
			sc.close();
			
		}
		for(i=0;i<size;i++)
		{
			array1[i]=sc.nextInt();
			sc.close();	
		}
		
		for(i=0;i<size;i++)
		{
			add [i]= array1[i] + array2[i];
		    sub [i]= array1[i] - array2[i];
		    mul [i]= array1[i] * array2[i];
		    div [i] = array1[i] / array2[i];
		    
		}
		System.out.println("Add \t Sub \t Mul \t Div \t mod");
		for(i=0;i<size;i++)
		{
			System.out.println("\n%d\t"+add[i]);
			System.out.println("\n%d\t"+sub[i]);
			System.out.println("\n%d\t"+mul[i]);
			System.out.println("\n%d\t"+div[i]);
			
		}*/
		/*int n, sum = 0;
        float average;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n ; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
        average = (float)sum / n;
        System.out.println("Average:"+average);
    */
		
		int arraySize,sum=0;
		float average;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of Elements you want to Put in this array : ");
		arraySize=sc.nextInt();
		int a[] = new int[arraySize];
		System.out.println("Enter the Elements : ");
		for(int i=0;i<arraySize;i++)
		{
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum:"+sum);
        average = (float)sum / arraySize;
        System.out.println("Average:"+average);
		
		
		
	}

}
