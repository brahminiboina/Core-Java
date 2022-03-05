package com.java.functionalProgramming;

import java.util.ArrayList;
import java.util.List;


@FunctionalInterface
interface PrintNumber{
	public void print(Integer integer);
}

public class PrintSquareUingLamdaExpressions {
int i = 0;
	public static void main(String[] a) {
		//List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		//int i=1;
		List<Integer> numbers = new ArrayList<Integer>() ;
		numbers.add(12);numbers.add(9);numbers.add(13);numbers.add(4);numbers.add(6);
		numbers.add(2);numbers.add(4);numbers.add(12);numbers.add(15);
		for(int i=0; i< numbers.size(); i++) {
			if(numbers.get(i)%2 == 0) {
				final int x = i;
				PrintNumber p = s -> System.out.println("square of "+numbers.get(x)+" is : "+ (numbers.get(x))*(numbers.get(x)));
				p.print(numbers.get(i));
				
			}
			
		}
		
	}
}