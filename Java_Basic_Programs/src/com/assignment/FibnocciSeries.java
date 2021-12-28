package com.assignment;

import java.util.Scanner;

public class FibnocciSeries {
	public static void main(String[] args) {
		int num, a=0,b=1,c=0,i;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = scn.nextInt();
		for( i=1;i<=num;i++) {
			System.out.print("\t" +a);
			c = a+b;
			a = b;
			b = c;
			
		}
		
	}

}
