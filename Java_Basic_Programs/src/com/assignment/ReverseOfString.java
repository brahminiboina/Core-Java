package com.assignment;
//8.Reverse of String.
import java.util.Scanner;
public class ReverseOfString {
	public static void main(String[] args) {
		String str,rev="";
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string:");
		str = scn.nextLine();
		int len = str.length();
		for(int i = len-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println("Reverse of a sting "+str+" is: "+rev);
		
	}

}
