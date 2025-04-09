package com.interviewquestions62streamapi;

import java.util.stream.IntStream;

public class FindCountOfwordInTheGivenStream52 {
	
	public static void main(String[] args) {
		
		String s="xoxoxoxoxbyebyexoxo";
		String check="xo";
		
		  long count = IntStream.range(0, s.length()-1)
		           .filter(x->s.substring(x,x+2).equals(check))
		           .count();
		  System.out.println(count);
		  
	}

}
