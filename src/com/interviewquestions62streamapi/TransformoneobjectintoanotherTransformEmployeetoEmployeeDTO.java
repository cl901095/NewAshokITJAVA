package com.interviewquestions62streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class TransformoneobjectintoanotherTransformEmployeetoEmployeeDTO {

	public static void main(String[] args) {
		
		List<Employe> employes=List.of(new Employe(1, "Alice"),
				                       new Employe(2, "kumar"));
		
		List<EmployeeDTO> empDtList=employes.stream()
				                            .map(e->new EmployeeDTO(e.id, e.name))
				                            .collect(Collectors.toList());
		
		                   empDtList.forEach(System.out::println);
	}

}
