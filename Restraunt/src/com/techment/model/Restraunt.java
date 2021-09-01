package com.techment.model;

import java.util.List;

public class Restraunt {

	String restrauntName;
	iHotDrink hotDrink;
	iSoftDrink softDrink;
	List<String> employeeName;
	
	
	
	
	public void setRestrauntName(String restrauntName) {
		this.restrauntName = restrauntName;
	}






	public void setHotDrink(iHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}






	public void setSoftDrink(iSoftDrink softDrink) {
		this.softDrink = softDrink;
	}






	public void setEmployeeName(List<String> employeeName) {
		this.employeeName = employeeName;
	}






	public void displayRestrauntDetails()
	{
		System.out.println("Restraunt Name = "+restrauntName);
	hotDrink.drink();
	softDrink.drink();
	System.out.println("List of Employee = "+employeeName);
		
	}
	
}
