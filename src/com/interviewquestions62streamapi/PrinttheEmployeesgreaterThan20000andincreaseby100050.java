package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrinttheEmployeesgreaterThan20000andincreaseby100050 {

	public static void main(String[] args) {
		List<Employeess> empList=Arrays.asList(new Employeess(45000, "chandra"),
				                               new Employeess(34000, "sekhar"),
				                               new Employeess(6000, "chandu"));
		
		//Print all Employees with salary greater than 20000 and increase their salary by 1000.
		
		empList.stream().filter(x->x.getSalary()>20000)
		                .peek(x->x.setSalary(x.getSalary()+1000))
		                .collect(Collectors.toList())
		                .forEach(System.out::println);
		
	}

}
