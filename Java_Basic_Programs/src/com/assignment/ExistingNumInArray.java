package com.assignment;
//26.Find a given number existing or not in an array
import java.util.Scanner;
public class ExistingNumInArray {
	public static void main(String[] args) {
		int num;
		boolean isFound = false;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		num = scn.nextInt();
		int[] arr = new int[] {5,6,3,98,5,3,4,56};
		for(int i=0;i<arr.length;i++) {
			if(num == arr[i]) {
				isFound = true;
				break;
			}
		}
		System.out.println(isFound);
		
	}
	
	

}
