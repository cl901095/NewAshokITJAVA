package com.interviewquestions62streamapi;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UsingInfinateStreamsloop47 {
	
	public static void main(String[] args) {
		
		//use limit for infinate Stream
		          Stream<Integer> infinateStream = Stream.iterate(1, x->x+1);
		          
		          infinateStream.limit(10).forEach(System.out::println);
		          
		 // Use primitives
		          
		     IntStream intstreams=IntStream.iterate(1, x->x+1);
		     intstreams.limit(10).forEach(System.out::println);
		     
		 //Incorrect Usage
		     Stream<Double> randoms=Stream.iterate(Math.random(), n->Math.random());
		     randoms.limit(10).forEach(System.out::println);
		     
		 //CorrectUsage
		     Stream<Double> randomgenerate=Stream.generate(Math::random);
		     randomgenerate.limit(10).forEach(System.out::println);
		     
	}

}
