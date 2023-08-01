package com.java;
import java.util.*;
public class fibonacciSeries {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no n as input");
		int num = sc.nextInt();
		int n1 = 0;
		int n2 = 0;
		int n3 = 1;
		
		for(int i=0; i<num; i++)
		{
			n1 = n2;
			n2 = n3;
			n3 = n1+n2;
			System.out.println(n1  + " ");
		}	
	}
}
