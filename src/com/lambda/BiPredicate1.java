package com.lambda;

import java.util.function.BiPredicate;

public class BiPredicate1 {

	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer>	 bip =(i,j)->(i+j)>=20;
		System.out.println(bip.test(2, 3));
		System.out.println(bip.test(50, 60));
	}
}
