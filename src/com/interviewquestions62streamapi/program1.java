package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class program1 {

	public static void main(String[] args) {
	
//		//Using Stream API extract messages in the correct 
		//chronological order from the given log data in format "HH:MM:ID:Message"
//		Input:
			List<String> logs = Arrays.asList( "14:30:3:Server started",
			"14:30:1:User logged in",
			"14:29:2:Database connected",
			"18:32:4:User logged out");
//			Output:
//			Database connected
//			User logged in Server started
//			Per logout
		
		
	
			List<String> collect = logs.stream().sorted(Comparator.comparing((String log)->log.split(":")[0])
					.thenComparing(log->log.split(":")[1])
					.thenComparing(log->Integer.parseInt(log.split(":")[2])))
			        .map(log->log.split(":",4)[3])
			        .collect(Collectors.toList());
			
			System.out.println(collect);
		
		

	}

}
