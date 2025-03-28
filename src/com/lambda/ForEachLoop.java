package com.lambda;

import java.util.ArrayList;

public class ForEachLoop {

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<>();

		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		System.out.println(a1);

		// Approach 1 using of for loop
		for (int i = 0; i < a1.size(); i++) {
			System.out.println("for loop   " + a1.get(i));
		}

		// approach 2 using of for each loop
		for (Integer a : a1) {
			System.out.println("for each loop  " + a);
		}

		// Appoach 3 using of for each method Lambda expression
		a1.forEach(a -> System.out.println(a)); // consumer lambda

	}

}
