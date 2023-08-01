package com.java;
import java.util.*;
public class SolidRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n & m As input");
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
