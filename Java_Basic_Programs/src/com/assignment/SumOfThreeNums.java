package com.assignment;
//12.sum of three numbers
import java.util.Scanner;
public class SumOfThreeNums {
	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 1st num:");
		num1 = scn.nextInt();
		System.out.println("Enter 2nd num:");
		num2 = scn.nextInt();
		System.out.println("Enter 3rd num:");
		num3 = scn.nextInt();
		int sum = num1 + num2 + num3;
		System.out.println(+sum);
	}

}