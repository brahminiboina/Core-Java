package com.assignment;

//3.check whether the given number is even or odd.
import java.util.Scanner;
public class EvenOrOdd {
	public static void main(String[] args) {
		int num;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a number:");
		num = scn.nextInt();
		if(num % 2 == 0) {
			System.out.println("The given number "+num+" is even");
		}else {
			System.out.println("The given number "+num+" is odd");
		}
	}
}
