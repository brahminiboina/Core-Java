package com.assignment;
//14.Sum of n numbers without using Array
import java.util.Scanner;
public class SumOfNNum {
	public static void main(String[] args) {
		int num,sum=0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter how many numbers to be added:");
		num = scn.nextInt();
		int var = Integer.MIN_VALUE;
		System.out.println("Enter "+num+" no.'s");
		for(int i=0;i<num;i++) {
			var = scn.nextInt();
			sum += var;
		}
		System.out.println("Then sum of "+num+" numbers is: "+sum);
	}
}
