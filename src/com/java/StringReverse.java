package com.java;
import java.util.*;

public class StringReverse {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String str as input");
		String str = sc.nextLine();
		String reverse = "";
		int length = str.length();
		for(int i=length-1; i>=0; i--)
		{
			reverse = reverse+str.charAt(i);
		}
		System.out.println("Reverse String is " +reverse);
	}

}
