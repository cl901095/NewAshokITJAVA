package com.interviewquestions62streamapi;

import java.util.Arrays;

public class FindOUtWordWhichContains2Vowles {
	
	public static void main(String[] args) {
		
		String s=" I am a java developer";
		
		Arrays.stream(s.split(" ")).filter(x->x.replaceAll("[aeiouAEIOU]", "").length()==2).forEach(System.out::println);	
		
	}

}
