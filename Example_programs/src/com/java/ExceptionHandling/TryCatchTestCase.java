package com.java.ExceptionHandling;

public class TryCatchTestCase {
	public static void main(String[] args) {
		int a =fun(1,2); 
		System.out.println("a: "+a);
	}
	static int fun(int a, int b) {
		try {
			a =1 ;
			System.out.println("a::"+a);
			return a;
		}catch (Exception e) {
			e.printStackTrace();
			a=2;
			//return 2;
		}finally {
			a=3;
			System.out.println("a:" +a);
			//return 3;
		}
		
		return 5;
		
	}

}
