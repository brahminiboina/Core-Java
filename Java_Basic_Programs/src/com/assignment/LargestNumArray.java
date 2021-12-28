package com.assignment;
//24.Largest among n numbers in an array.
import java.util.Scanner;
public class LargestNumArray {
	public static void main(String[] args) {
	int n,arr[],i,large;
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter number:");
	n = scn.nextInt();
	arr = new int[n];
	int  len = arr.length;
	System.out.println("Enter the "+n+" elements of an array:");
	for(i=0;i<arr.length;i++) {
		arr[i] = scn.nextInt();
	}
	/*large = arr[0];
	for(i=1;i<arr.length;i++) {
		if(large<arr[i]) {
		large = arr[i];
	}
		small = arr[0];
	for(i=1;i<arr.length;i++) {
		if(small>arr[i]) {
		small = arr[i];
		}
	}
	System.out.println("The largest number in an array is "+large);
	System.out.println("The smallest number in an array is "+small);
	}*/
	for( i=0;i<len;i++) {
		for(int j=i+1;j<len;j++) {
			if(arr[i]>arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	System.out.println("The largest number in an array is "+arr[len-1]);
	}
}