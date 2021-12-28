package com.assignment;
//22.Largest Among Three Numbers.
import java.util.Scanner;
public class LargestOfThreeNum {
	public static void main(String[] args) {
		int a,b,c;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number a:");
		a = scn.nextInt();
		System.out.println("Enter number b:");
		b = scn.nextInt();
		System.out.println("Enter number c:");
		c = scn.nextInt();
		if(a>b && a>c){
			System.out.println("The largest number among "+a+" & " +b+" & "+c+" is:" +a);
		}else if(b>c) {
			System.out.println("The largest number among "+a+" & " +b+" & "+c+" is:" +b);
		}else {
			System.out.println("The largest number among "+a+" & " +b+" & "+c+" is:" +c);
		}
	}
}
