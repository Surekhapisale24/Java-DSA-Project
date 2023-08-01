package com.java;
import java.util.*;
public class StringPalindrome {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string str as input");
		String str = sc.nextLine();
		String reverse = "";
		int length = str.length();
		for(int i = length-1; i>=0; i--)
		{
			reverse = reverse + str.charAt(i);
		}
		System.out.println("revrse is " +reverse );
		if(str.equals(reverse))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
}
