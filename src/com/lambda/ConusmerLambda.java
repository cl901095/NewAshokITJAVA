package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConusmerLambda {
	
	public static void main(String[] args) {
		
		Consumer<String> c=(name)-> System.out.println(name+"  hello");
		c.accept("chandra");
		c.accept("sekhar");
		c.accept("lingisetti");
		
		 List<Integer> numbers= Arrays.asList(10,20,30,40,50);
		 // to print arrays
		 // for loop
		 // for each loop
		 // iterator
		 // list iterator
		 numbers.forEach(i->System.out.println(i));
	}

}
