package com.lambda;

import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String[] args) {
		
		Predicate<Integer> p= i -> i<10; // Instead of if condition we use Predicate and lambda function
		boolean b=p.test(5);
		System.out.println(b);
		System.out.println(p.test(10));
		
	}

}
