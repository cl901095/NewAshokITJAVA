package com.interviewquestions62streamapi;

import java.util.stream.Stream;

public class ConcanateTwoStringsUsingStream43 {
	
	public static void main(String[] args) {
		
		Stream<String> stream1= Stream.of("java","python");
		Stream<String> stream2=Stream.of("c","C++");
		
		Stream<String> ConcateString=Stream.concat(stream1, stream2);
		ConcateString.forEach(System.out::println);
		
		
		
	}

}
