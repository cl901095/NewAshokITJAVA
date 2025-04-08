package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MultiplyArrayElements39 {

	public static void main(String[] args) {

		Integer[] arr = { 1, 2, 3, 4, 5 };

		List<Integer> arrList = Arrays.asList(arr);

		Optional<Integer> reduce = arrList.stream().reduce((a, b) -> a * b);
		if (reduce.isPresent()) {

			System.out.println(reduce.get());
		}
	}
}
