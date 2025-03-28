package com.interviewQuestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Emp {

	private static Optional<Employee> collect;
	

	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<Employee>();

		emp.add(new Employee(1, "jhansi", 32, "Female", "HR", 2011, 25000.00));
		emp.add(new Employee(2, "smith", 25, "Male", "Sales", 2015, 13500.00));
		emp.add(new Employee(3, "David", 29, "Male", "Inrastructure", 2012, 18000.00));
		emp.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.00));
		emp.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.00));
		emp.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.00));
		emp.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.00));
		emp.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.00));
		emp.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.00));
		emp.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.00));
		emp.add(new Employee(11, "Gouri", 27, "Female", "Inrastructure", 2014, 15700.00));
		emp.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.00));
		emp.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.00));
		emp.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.50));
		emp.add(new Employee(15, "Ashok", 23, "Male", "Inrastructure", 2018, 12700.00));
		emp.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.00));
		
//		//1. How many male and female employees are there in the orgainization ?
//		Map<String, Long> map1=  emp.stream()
//				                     .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//		                              System.out.println(map1);
//		
//		
//		//2. Print the name of all departments in the orgainzation
//		// Approach 1
//		emp.stream()
//		   .map(i->i.department)
//		   .distinct()
//		   .forEach(i->System.out.println(i));
//		
//		//Approach 2
//		emp.stream()
//		   .map(Employee::getDepartment) 
//		   .distinct()
//		   .forEach(i->System.out.println(i));
//		
//		
//		//3. What is the average age of male and female employees ?
//		Map<String, Double> map2=  emp.stream()
//		                              .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
//                                       System.out.println(map2);
//                                       
//                                       
//                                       
//       //4.Get the details of highest paid empoloyee in the orgainization
//           Optional<Employee> map3= emp.stream().collect(Collectors.maxBy(Comparator.comparing(i->i.salary)));
//                                    System.out.println(map3.get());
//                                    
//                                    if(map3.isPresent()) {
//                                    	Employee emps= map3.get();
//                                    	System.out.println(emps);
//                                    	  }
		// Approach get maximum highest salary in the empolyeee
                 Optional<Employee>  collect = emp.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));		
		                               System.out.println(collect.get());
		                               
		//who is second highest slaary of employee
		                               
		         // Approach 1
		     	Optional<Employee> first = emp.stream()
		     			                      .sorted(Comparator.comparing(Employee::getSalary).reversed())
		     			                      .skip(1).findFirst();// if we want to find out thord hihgest slaary just give value 2 in skip method
		     	                           System.out.println(first.get());
		             
		     	//Approach2
                 List<Employee> collect2 = emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
		     	                           .collect(Collectors.toList());
                                          System.out.println(collect2.get(1));
		                               
//        //5.Get the names of all employees who have joined after 2015 ?
//                    emp.stream()
//                       .filter(i->i.getYearOfJoining()>2015)
//                       .map(i->i.name)
//                       .forEach(i->System.out.println(i));   
//                    
//        //6. Count the names of all employees in each department        
//               Map<String, Long>   map4 = emp.stream()
//                                              .collect(Collectors.groupingBy(Employee:: getDepartment, Collectors.counting()));
//                                               System.out.println(map4);
//                                    
//         //7. What is the average salary of the each department
//                 Map<String , Double> map5    =emp.stream()
//                                             .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
//                                             System.out.println(map5);
//                                             
                                             
         //8. Get the details of youngest male employee in the Devlopment Department
                                             
            Optional<Employee>     optional = emp.stream()
                      .filter(i->i.getGender().equals("Male")&& i.getDepartment().equals("Development"))
                      .min(Comparator.comparing(Employee:: getAge));
            
                   if(optional.isPresent()) {
                	   System.out.println(optional.get());
                   }
                   
                   
           //9. Who has the most expreince in the organization
             Optional<Employee>      optional1   = emp.stream()
            		                                  .collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
                   
                      if(optional1.isPresent()) {
                    	  System.out.println(optional1.get());
                      }
                          
            // 10. How many male and female employees are there in the sales team ?
                   Map<String, Long> map = emp.stream().filter(i->i.getDepartment().equals("Sales"))
                         .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
                                    System.out.println(map);
                                    
                                    
                                    
            //11.what is average salary of male and female employees?
            // 12.List down the names of all employees  in each department
            //13.what is avaerage salary and total slary of the wholw orgnization
            // 14. separtae the employees who are younger and equal to 25 years  from those employes who are older than 25 years
            //15.who is the olddest employee in the organization? what his age and department he belongs to ?               
            
                                    
                                    
                                    
	}

}
