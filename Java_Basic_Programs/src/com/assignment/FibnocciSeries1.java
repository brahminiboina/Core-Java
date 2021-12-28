package com.assignment;
//10.fibnocci series 
import java.util.Scanner;
public class FibnocciSeries1 {
	public static int fib(int num) {
		if(num<=1) {
			return num;
		}
		return fib(num-1)+fib(num-2);
	}
	public static void main(String[] args) {
		int num;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scn.nextInt();
		System.out.println(fib(num));
	}

}
