package com.techment;
import javax.persistence.*;

@Entity
@Table(name="address300")
public class Address {

	@Id
	int dorrNo;
	String streetName;
	String cityName;
	
	
	
	
	
	
	public Address() {
		super();
	}
	public Address(int dorrNo, String streetName, String cityName) {
		super();
		this.dorrNo = dorrNo;
		this.streetName = streetName;
		this.cityName = cityName;
	}
	public int getDorrNo() {
		return dorrNo;
	}
	public void setDorrNo(int dorrNo) {
		this.dorrNo = dorrNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
	
	
}
