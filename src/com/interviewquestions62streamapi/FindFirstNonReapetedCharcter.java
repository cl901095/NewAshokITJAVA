package com.interviewquestions62streamapi;

import java.util.Arrays;

public class FindFirstNonReapetedCharcter {
	public static void main(String[] args) {
		String s="chandra sekhar";
		
		String string = Arrays.stream(s.split("")).filter(c->s.indexOf(s)==s.indexOf(s)).findFirst().get();
		System.out.println(string);
	}

}
