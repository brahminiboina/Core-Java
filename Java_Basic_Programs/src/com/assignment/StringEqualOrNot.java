package com.assignment;
//Checking whether two strings are equal or not.
import java.util.Scanner;
public class StringEqualOrNot {
	public static boolean StrEql(String str1,String str2) {
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String str1,str2;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string1:");
		str1 = scn.nextLine();
		System.out.println("Enter the string2:");
		str2 = scn.nextLine();
		System.out.println(StrEql(str1,str2));
		
		
	}

}

