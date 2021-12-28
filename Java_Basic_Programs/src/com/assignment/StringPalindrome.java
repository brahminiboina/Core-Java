package com.assignment;
//9.check whether the String is palindrome or not.
import java.util.Scanner;
public class StringPalindrome {
	public static void main(String[] args) {
	String str,rev="";
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter the string:");
	str = scn.nextLine();
	int len = str.length();
	for(int i = len-1;i>=0;i--) {
		rev = rev+str.charAt(i);
	}
	//if(str.equals(rev)) {
	if(str == rev) {
		System.out.println("Given String "+str+" is a palindrome");
	}else {
		System.out.println("Given String "+str+" is not a palindrome");
	}
	}
}
