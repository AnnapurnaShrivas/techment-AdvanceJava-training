package com.techment;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee300")
public class Employee {

	@Id
	int id;
	String name;
	String designation;
	
	@OneToOne
	Address address;
	
	
	
	
	
	public Employee() {
		super();
	}
	public Employee(int id, String name, String designation, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
