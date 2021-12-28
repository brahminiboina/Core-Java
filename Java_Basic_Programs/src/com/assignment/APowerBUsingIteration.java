package com.assignment;

//18.a power b using Iteration.
import java.util.Scanner;
public class APowerBUsingIteration {
	public static void main(String[] args) {
		int a,b,p=1;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number a:");
		a = scn.nextInt();
		System.out.println("Enter number b:");
		b = scn.nextInt();
		for(int i=1;i<=b;i++) {
			p = p*a;
		}
		System.out.println(+a+" power "+b+" is:"+p);
	}
}
