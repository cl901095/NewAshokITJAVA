package com.interviewquestions62streamapi;

import java.util.stream.IntStream;

public class FindmultiplyAlternativenumbersinArray {
	public static void main(String[] args) {
		int [] arr= {4,5,6,7,8,9};
		
		int ans = IntStream.range(0, arr.length).filter(x->x%2==0).map(x->arr[x]).reduce(1,(a,b)->a*b);
		System.out.println(ans);
	}

}
