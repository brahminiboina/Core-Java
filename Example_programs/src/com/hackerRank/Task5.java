package com.hackerRank;
import java.util.*;
import java.io.*;

public class Task5 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of t");
        int t=in.nextInt();
        int a=0,b=0,n=0;
        for(int i=0;i<t;i++){
        	
        	a = in.nextInt();
        	
        	b = in.nextInt();
            n = in.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<b;j++){
                int s = a ;
                System.out.print(s+" ");
                break;
            }
        }
        in.close();
    }
}



