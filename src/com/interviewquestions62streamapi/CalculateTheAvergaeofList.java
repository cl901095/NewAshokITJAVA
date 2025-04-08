package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.List;

public class CalculateTheAvergaeofList {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		double asDouble = asList.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();
		System.out.println(asDouble);
	}

}
