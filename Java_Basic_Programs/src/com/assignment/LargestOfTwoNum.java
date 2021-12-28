package com.assignment;
//21.Largest Among Two Numbers
import java.util.Scanner;
public class LargestOfTwoNum {
	public static void main(String[] args) {
		int a,b;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number a:");
		a = scn.nextInt();
		System.out.println("Enter number b:");
		b = scn.nextInt();
		if(a>b){
			System.out.println("The largest number among "+a+" & " +b+" is:" +a);
		}else {
			System.out.println("The largest number among "+a+" & " +b+" is:" +b);
		}
	}
	
		
}

