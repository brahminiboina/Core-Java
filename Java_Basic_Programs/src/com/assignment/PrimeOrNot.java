package com.assignment;
//4.check whether the given number is prime or not.
import java.util.Scanner;
public class PrimeOrNot {
	public static void main(String[] args) {
		int num;
		boolean isPrime = true;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a number:");
		num = scn.nextInt();
		for(int i=2;i<num;i++) {
	//   for(int i=2;i<num/2;i++) {
	//   for(int i=2;i<Math.sqrt(num);i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		//System.out.println(isPrime);
		if(isPrime) {
			System.out.println("The given number "+num+" is prime");
		}else {
			System.out.println("The given number "+num+" is not a prime");
		}

	}

}