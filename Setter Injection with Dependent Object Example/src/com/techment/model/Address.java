package com.techment.model;

public class Address {

	private String addressLine1,city,state,country;  
	  
	//getters and setters  
	
	  
	public String toString(){  
	    return addressLine1+" "+city+" "+state+" "+country; 
}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
