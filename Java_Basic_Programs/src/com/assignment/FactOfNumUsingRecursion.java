package com.assignment;
//19.factorial of a given number using recursion.
import java.util.Scanner;
public class FactOfNumUsingRecursion {
	private static int fact(int n) {
		if(n<=0) {
			return 1;
		}else {
			return n*fact(n-1);
		}
		
	}
	public static void main(String[] args) {
	int num;
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter a number:");
	num = scn.nextInt();
	int res = fact(num);
	System.out.println("factorial of " +num+" is "+res);
	}
	
}