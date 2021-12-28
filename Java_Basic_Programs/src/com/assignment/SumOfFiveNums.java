package com.assignment;
//13.sum of five numbers
import java.util.Scanner;
public class SumOfFiveNums {
	public static void main(String[] args) {
		int num1,num2,num3,num4,num5;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 1st num:");
		num1 = scn.nextInt();
		System.out.println("Enter 2nd num:");
		num2 = scn.nextInt();
		System.out.println("Enter 3rd num:");
		num3 = scn.nextInt();
		System.out.println("Enter 4th num:");
		num4 = scn.nextInt();
		System.out.println("Enter 5th num:");
		num5 = scn.nextInt();
		int sum = num1 + num2 + num3 + num4 + num5;
		System.out.println(+sum);
	}

}
