package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class SlicingOperation1 {
	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("chandra","sekhar","lingisetti","tcs","conginzent");
		
		// using limit method
		names.stream().limit(3).forEach(i->System.out.println(i));
		
		//using skip method
		names.stream().skip(2).forEach(i->System.out.println(i));
		
		List<String> courses=Arrays.asList("java","c","springboot","core java","advance java","java");
		
		// using distinct method
		courses.stream().distinct().forEach(i->System.out.println(i));
		
	}

}
