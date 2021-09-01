package com.OneToMany;

import javax.persistence.*;

@Entity
@Table(name="employee400")
public class EmployeeD {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	String designation;
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
	public EmployeeD(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}
	
	
	
	
	
	
}
