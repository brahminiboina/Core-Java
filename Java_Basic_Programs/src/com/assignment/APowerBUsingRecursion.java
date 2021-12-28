package com.assignment;
//20.a power b using Recursion.
import java.util.Scanner;
public class APowerBUsingRecursion {
	private static int Pow(int a,int b) {
		if(b<1) {
			return 1;
		}
		else {
			return a*Pow(a,b-1);	
		}
	}
	
	public static void main(String[] args) {
		int a,b,p=1;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number a:");
		a = scn.nextInt();
		System.out.println("Enter number b:");
		b = scn.nextInt();
		p = Pow(a,b);
		System.out.println(+a+" power "+b+" is:"+p);
	}
}
