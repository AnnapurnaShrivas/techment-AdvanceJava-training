package com.techment.model;

public class Employee {

	private int id;  
	private String name;  
	private Address address;  
	  
	//setters and getters
	
	  
	public void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println(address);  
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}  
}
