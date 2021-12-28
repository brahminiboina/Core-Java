package com.assignment;
//1.Swapping values of two numbers.

import java.util.Scanner;

public class SwapTwoNum {
	public static void main(String[] args) {
		int a,b,temp;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the 1st numbers to be swapped a: ");
		a = scn.nextInt();
		System.out.print("Enter the 2nd numbers to be swapped b: ");
		b = scn.nextInt();
		temp = a;
		a = b;
		b = temp;
		System.out.println("variables after swappig a: "+a+ " and b: " +b );
	}

}