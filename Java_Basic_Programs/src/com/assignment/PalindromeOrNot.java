package com.assignment;
//7.Check whether the given no is palindrome or not.
import java.util.Scanner;
public class PalindromeOrNot {
	public static void main(String[] args) {
		int num,r=0,temp=0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number:");
		num = scn.nextInt();
		temp = num;
		//for(int i=0;num>0;i++){
		while(num>0) {
			r = r*10;
			r = r+(num%10);
			num = num/10;
		}
		if(r == temp) {
			System.out.println("Given number "+temp+" is a palindrome");
		}else {
			System.out.println("Given number "+temp+" is not a palindrome");
		}
	}
}
