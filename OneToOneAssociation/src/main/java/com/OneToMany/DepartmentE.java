package com.OneToMany;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="dept400")
public class DepartmentE {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	
	
	@OneToMany
	@JoinColumn(name="deptid")
	List<EmployeeD> employees;


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


	public List<EmployeeD> getEmployees() {
		return employees;
	}


	public void setEmployees(List<EmployeeD> employees) {
		this.employees = employees;
	}
	
	
	
	
}
