package com.assignment;
//11.sum of two numbers
import java.util.Scanner;
public class SumOfTwoNums {
	public static void main(String[] args) {
		int num1,num2;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 1st num:");
		num1 = scn.nextInt();
		System.out.println("Enter 2nd num:");
		num2 = scn.nextInt();
		int sum = num1 + num2;
		System.out.println(+sum);
	}

}