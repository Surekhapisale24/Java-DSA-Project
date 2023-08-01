package com.java;
import java.util.*;
public class ReverseNo {
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter teh no n as input");
		int num = sc.nextInt();
		int rem = 0;
		int rev = 0;
		
		while(num != 0)
		{
			 rem = num % 10;
			 rev = rev*10+rem;
			 num =  num /10;
		}
		System.out.println("Reverse no is "  +rev );
	}
}