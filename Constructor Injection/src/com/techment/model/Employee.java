package com.techment.model;

public class Employee {

	private int id;  
	private String name;  
	private int salary;//Aggregation  
	  

	
	
	  
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
	




	public void setName(String name) {
		this.name = name;
	}







	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}



}
