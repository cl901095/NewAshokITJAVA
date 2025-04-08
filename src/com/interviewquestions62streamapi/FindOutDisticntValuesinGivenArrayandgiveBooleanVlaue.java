package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOutDisticntValuesinGivenArrayandgiveBooleanVlaue {
	public static void main(String[] args) {
		int[] a = { 1,2,4,5,9 };

		List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
		boolean ans = list.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting())).values().stream()
				.noneMatch(x -> x > 1);

		System.out.println(ans);
	}

}
