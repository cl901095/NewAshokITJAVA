package com.lambda;

import java.util.function.BiFunction;

public class BiFunction1 {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> bfi = (a, b) -> (a + b);
		System.out.println(bfi.apply(10, 20));
	}

}
