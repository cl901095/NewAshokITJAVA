package com.lambda;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {

		// Function--> will take input-->will return output
		Function<String, Integer> f = name -> name.length();
		System.out.println(f.apply("chandra"));
		System.out.println(f.apply("sekhar"));
		System.out.println(f.apply("lingisetti"));
	}

}
