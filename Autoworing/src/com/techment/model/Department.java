package com.techment.model;

public class Department {
	
	String hodName;
	
	

	public void setHodName(String hodName) {
		this.hodName = hodName;
	}



	public void deptDetails()
	{
		System.out.println("Department block");
		System.out.println("minimum 6 dept will be there");
		System.out.println("hod name = "+hodName);
	}
}
