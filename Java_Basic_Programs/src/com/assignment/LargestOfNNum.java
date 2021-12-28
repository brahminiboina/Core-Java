package com.assignment;
//23.Largest among n no.s without using Array.
import java.util.Scanner;
public class LargestOfNNum {
	public static void main(String[] args) {
		int num,large = 0,i;
		Scanner scn = new Scanner(System.in);
		int PresentVal = Integer.MIN_VALUE;
		System.out.println("Enter the no. of elements");
		num=scn.nextInt();
		System.out.println("Enter "+num+" numbers");
		for(i=0;i<num;i++) {
			PresentVal = scn.nextInt();
			if(large<PresentVal) {
				large=PresentVal;
			}
		}
		System.out.println("The largest among the "+num+" numbers is: "+large);
		
	}
		
}