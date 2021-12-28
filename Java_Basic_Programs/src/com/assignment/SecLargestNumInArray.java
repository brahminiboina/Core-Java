package com.assignment;
	//25.Find the second largest no. in an array.
	import java.util.Scanner;
	public class SecLargestNumInArray {
		public static void main(String[] args) {
			int[] arr;
			int num,temp;
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter the size of the array:");
			num = scn.nextInt();
			arr = new int[num];
			int len=arr.length;
			System.out.println("Enter "+num+" elements");
			for(int i=0;i<arr.length;i++) {
				arr[i] = scn.nextInt();
			}
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.println("The second largest element in a given array is "+arr[len-2]);
		
		}
	}
