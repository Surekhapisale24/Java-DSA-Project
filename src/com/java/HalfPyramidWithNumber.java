package com.java;
import java.util.*;
public class HalfPyramidWithNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input n");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
}
