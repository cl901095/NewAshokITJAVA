package com.interviewquestions62streamapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenerateTheFirst10NumbersOfFibanociSeries34 {
	
	public static void main(String[] args) {
		
		//streamApi Approach
		List<Integer> collect = Stream.iterate(new int[] {0,1}, f->new int[] {f[1], f[0]+f[1]})
		      .limit(10).map(f->f[0])
		      .collect(Collectors.toList());
		System.out.println(collect);
		
		
		
		
		// normal Approach
		int a=0;
		int b=1;
		System.out.print(a+" ");
		for(int i=1;i<10;i++) {
			System.out.print(b+" ");
			int sum=a+b;
			a=b;
			b=sum;
		}
	}

}
