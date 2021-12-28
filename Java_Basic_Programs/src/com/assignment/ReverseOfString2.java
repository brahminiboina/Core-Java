package com.assignment;
//8.Reverse of String.
import java.util.Scanner;
public class ReverseOfString2 {
	public static String StringRev(String str){
		return new StringBuffer(str).reverse().toString();
	}
	public static void main(String[] args) {
		String str;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string:");
		str = scn.nextLine();
		System.out.println(StringRev(str));
		
	}

}