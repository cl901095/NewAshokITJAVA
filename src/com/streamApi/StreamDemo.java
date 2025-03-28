package com.streamApi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		// Approach 1 for stream creation
		Stream<Integer> Stream1 = Stream.of(1, 2, 3, 4, 5);

		ArrayList<String> names = new ArrayList<>();
		names.add("chandra");
		names.add("sekhar");
		names.add("lingisetti");

		// Approach 2 for stream creation
		Stream<String> Stream2 = names.stream();

	}
}
