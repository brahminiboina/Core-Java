package com.java.functionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class FindStreamReduceLambda {
	public static void main(String[] args)
    {
        // create a list of integers
    	//List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        List<Integer> numbers = new ArrayList<Integer>();
 
        // add elements to the list
        numbers.add(12);numbers.add(9);numbers.add(13);numbers.add(4);numbers.add(6);
		numbers.add(2);numbers.add(4);numbers.add(12);numbers.add(15);
		
		int num = numbers.stream().reduce(0,(x,y) -> y);
        /*.filter(n -> n % 2 == 0)
        .map(n -> n * n)*/
		
		System.out.println("The output is: " + num);
    }

}
