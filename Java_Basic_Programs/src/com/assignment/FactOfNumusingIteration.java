package com.assignment;
//17.factorial of a given number using iteration.
import java.util.Scanner;
public class FactOfNumusingIteration {
	public static void main(String[] args) {
		int num,fact=1;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number:");
		num = scn.nextInt();
		for(int i=1;i<=num;i++) {
			fact = i*fact;
		}
		System.out.println("factorial of " +num+" is "+fact);
	}

}
