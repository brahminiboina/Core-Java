package com.assignment;
//4.check whether the given number is prime or not.
import java.util.Scanner;
public class PrimeOrNot2 {
	public static void main(String[] args) {
		int num,count =0;
		boolean isPrime = false;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a number:");
		num = scn.nextInt();
		for(int i=2; i<num; i++) {
			if(num%i == 0) {
				count++;
				break;
			}
		}
		System.out.println("using boolean " +Prime(num));
		//System.out.println(+count);
			if(count==0) {
				System.out.println("Given number "+num+" is a prime");
			}else {
				System.out.println("Given number "+num+" is not a prime");
			}
			
	}

	private static boolean Prime(int num) {
		// TODO Auto-generated method stub
		for(int i=2;i<num/2;i++) {
			if(num %i == 0) {
				return false;
			}
		}
		return true;
	}

}
