package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Findtheaveragesalaryfromeachdepartment {
	
	public static void main(String[] args) {
		
	
	
	List<Employeesss> emp=Arrays.asList(new Employeesss("Alice", "IT", 50000.00),
			                            new Employeesss("chandu", "finance", 6000.00),
			                            new Employeesss("bob", "Hr", 90000.00),
			                            new Employeesss("frank", "IT", 5000.00));
	
	    Map<String, Double> collect = emp.stream().collect(Collectors.groupingBy(Employeesss::getDepartment, Collectors.averagingDouble(Employeesss::getSalary)));
	    
	collect.forEach((dept,salary)->System.out.println(dept+" "+salary));
	
	}
}
