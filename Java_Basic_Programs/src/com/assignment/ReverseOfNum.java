package com.assignment;
//5.Reverse Digit of a Given Number
import java.util.Scanner;
public class ReverseOfNum {
	public static void main(String[] args) {
		int num,r=0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number:");
		num = scn.nextInt();
		//for(int i=0;num>0;i++){
		while(num>0) {
			r = r*10;
			r = r+(num%10);
			num = num/10;
		}
			System.out.println("Reverse of a number is:" +r);
	}

}