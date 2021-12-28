package com.assignment;
//16.Sum Of first N Numbers.
import java.util.Scanner;
public class SumOfFirstNNum {
	public static void main(String[] args) {
		int num,sum=0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter how many numbers to be added:");
		num = scn.nextInt();
		//sum = num* (num+1)/2;
		for(int i=1;i<=num;i++) {
			sum +=i;
		}
		System.out.println("sum of first "+num+" numbers is:" +sum);
	}
}
