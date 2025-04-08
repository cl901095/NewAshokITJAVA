package com.interviewquestions62streamapi;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintStringCharacter {
	public static void main(String[] args) {

		String[] s = { "ewe", "jji", "jhj", "kwk", "aha" };

		System.out.println(Stream.of(s).collect(Collectors.groupingBy(x -> x.toString().substring(1, 2))));
	}

}
