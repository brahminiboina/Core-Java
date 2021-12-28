package com.assignment;
//6.check whether the given number is perfect or not.
import java.util.Scanner;
public class PerfectNumOrNot {
	public static void main(String[] args) {
		int num,sum=0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number:");
		num = scn.nextInt();
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum += i;
			}
		}
		if(sum==num) {
			System.out.println("Given number "+num+" is a perfect number");
		}else {
			System.out.println("Given number "+num+" is not a perfect number");
		}
	}

}
