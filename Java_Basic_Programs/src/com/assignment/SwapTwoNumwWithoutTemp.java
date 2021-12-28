package com.assignment;
//2.Swapping values of two numbers without using 3rd variable.
import java.util.Scanner;

public class SwapTwoNumwWithoutTemp {
	public static void main(String[] args) {
		int a,b;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the 1st numbers to be swapped a:");
		a = scn.nextInt();
		System.out.print("Enter the 2nd numbers to be swapped b:");
		b = scn.nextInt();
		a = (a+b);
		b = a-b;
		a = a-b;
		System.out.println("variables after swappig a:"+a+ " and b:" +b);
	}

}

