package com.java;
import java.util.*;
public class Pascals_Trangle {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the number n as input");
		int n = sc.nextInt();
		int number = 1;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n-i; j++){
				System.out.print(" ");
			}
			number = 1;
			for(int j=1; j<=i; j++){
				System.out.print(number + " ");
				number = number * (i-j)/(j);
			}
			System.out.println();
		}
	}
}

