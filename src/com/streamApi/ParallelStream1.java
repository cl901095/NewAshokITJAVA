package com.streamApi;

import java.util.stream.Stream;

public class ParallelStream1 {

	public static void main(String[] args) {

		System.out.println("===================Serial Stream=======================");
		Stream<Integer> names = Stream.of(1, 2, 3, 4);
		names.forEach(i -> System.out.println(i + " :: " + Thread.currentThread()));

		System.out.println("===================Parallel Stream==================");
		Stream<Integer> name = Stream.of(1, 2, 3, 4);
		name.parallel().forEach(i -> System.out.println(i + " :: " + Thread.currentThread()));
	}
}