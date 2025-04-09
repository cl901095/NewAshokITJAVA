package com.interviewquestions62streamapi;

public class EmployeeDTO {
	
	int empId;
	String empName;
	public EmployeeDTO(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [empId=" + empId + ", empName=" + empName + "]";
	}
	

}
