package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindKthSmallestElementInList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(7, 1, 3, 4, 5, 6, 7, 9, 0);
		int k = 3;

		List<Integer> collect = list.stream().sorted().collect(Collectors.toList());

		int ans = collect.stream().sorted().skip(k - 1).findFirst().get();
		System.out.println(collect);
		System.out.println(ans);
	}

}
