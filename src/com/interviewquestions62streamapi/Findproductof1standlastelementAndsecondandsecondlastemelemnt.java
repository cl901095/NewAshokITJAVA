package com.interviewquestions62streamapi;

import java.util.stream.IntStream;

public class Findproductof1standlastelementAndsecondandsecondlastemelemnt {
	
	public static void main(String[] args) {
		int [] a= {2,3,4,5,6,7};
		
		IntStream.range(0, a.length/2).map(x->a[x]*a[a.length-x-1]).forEach(System.out::println);
	}

}
