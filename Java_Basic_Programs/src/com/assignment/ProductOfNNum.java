package com.assignment;
//15.Product of n numbers without using Array
import java.util.Scanner;
public class ProductOfNNum {
	public static void main(String[] args) {
		int num,prod=1;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter how many numbers to be multiplied:");
		num = scn.nextInt();
		int var = Integer.MIN_VALUE;
		System.out.println("Enter "+num+" numbers");
		for(int i=0;i<num;i++) {
			var = scn.nextInt();
			prod = prod * var;
		}
		System.out.println("Product of "+num+" numbers is: "+prod);
	}
}