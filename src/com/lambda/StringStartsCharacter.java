package com.lambda;

import java.util.function.Predicate;

public class StringStartsCharacter {
	public static void main(String[] args) {
		
	// String array names starting with S using lambda expression
	
	String names[]= {"chandra","sekhar","anil","Nagendra","Sivanaji"};
	
	   Predicate<String> p= name -> name.charAt(0)=='S';
	   
	   for(String name: names) {
		   if(p.test(name))
		   System.out.println(name);
	   }
	   
	}

}
