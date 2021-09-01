package com.techment.model;

public class University {

	Department department;
	int noOfStudent;
	
	
	
	public void setDepartment(Department department) {
		this.department = department;
	}

   


	public void setNoOfStudent(int noOfStudent) {
		this.noOfStudent = noOfStudent;
	}




	public void displayDetails()
	{
		department.deptDetails();
		System.out.println("no of student = "+noOfStudent);
	}
	
}

