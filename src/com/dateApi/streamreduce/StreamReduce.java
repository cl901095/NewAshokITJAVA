package com.dateApi.streamreduce;

import java.util.Arrays;

public class StreamReduce {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };

		// find out sum of array
		int sum = 0;

		for (int i : nums) {
			sum = sum + i;
		}
		System.out.println(sum);

		// BY using Stream Reduce

		int reduce = Arrays.stream(nums).reduce(0, (a, b) -> (a + b));
		System.out.println(reduce);
	}
}
