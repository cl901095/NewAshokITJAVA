package com.interviewquestions62streamapi;

import java.util.stream.IntStream;

public class FindTheMiddeleCharacterOfString48 {
	
	public static void main(String[] args) {
		
	
	String s="education";
	
	 int len=s.length();
	 int mid=len/2;
	 
	 String midChar=IntStream.range(0, len).filter(x->len%2==0 ? (x==mid||x==mid-1):x==mid)
			                 .mapToObj(s::charAt)
			                 .collect(StringBuilder::new,
			                		 StringBuilder::append,
			                		 StringBuilder::append).toString();
	System.out.println("middle cagarcter of :  "+s+" is="+midChar);
	
	}
}
