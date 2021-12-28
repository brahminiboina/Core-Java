package com.assignment;
//10.fibnocci series
import java.util.Scanner;
public class FibnocciSeries2 {
	public static int fib(int num) {
		int a=0,b=1,c=0;
		for(int i=2;i<=num;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		return c;
	}
	public static void main(String[] args) {
		int num;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scn.nextInt();
		System.out.println(fib(num));
	}

}
