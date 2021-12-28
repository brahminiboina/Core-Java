package com.assignment;
//14.Sum of n numbers using Recursion
import java.util.Scanner;
public class SumofNNumUsingRecursion {
	public static int SumOf(int[] a, int n,int sum) {
		if(n<0) {
			return sum;
		}else {
		sum +=a[n];
		return SumOf(a,n-1,sum);
		}
		}
			
	public static void main(String[] args) {
		int num,sum=0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter how many numbers to be added:");
		num = scn.nextInt();
		int[] a = new int[num];
		System.out.println("Enter "+num+" no.'s");
		for(int i=0;i<num;i++) {
			System.out.println("Enter the "+(i+1)+"th number:");
			a[i] = scn.nextInt();
			}
		sum = SumOf(a,num-1,sum);
		System.out.println(+sum);
	}
	
}
