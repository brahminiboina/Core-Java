package com.java.functionalProgramming;
// Using stream filter to find sum of a list
import java.util.*;
 
class SquareOfDistinctNumbersUsingfilters_Streams {
    public static void main(String[] args)
    {
        // create a list of integers
    	//List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        List<Integer> numbers = new ArrayList<Integer>();
 
        // add elements to the list
        numbers.add(12);numbers.add(9);numbers.add(13);numbers.add(4);numbers.add(6);
		numbers.add(2);numbers.add(4);numbers.add(12);numbers.add(15);
		
		int sum = numbers.stream()
        .filter(n -> n%2 == 0)
        .filter(n -> n!=(n+1))
        /*.mapToInt(n -> n)
        .sum();*/
        .distinct()
        .reduce(0,(x,y) -> x+y);
       // .map(n -> n + n)
       // .forEach(System.out::println);
		
		System.out.println("sum is : " +sum);
    }
 
   
}