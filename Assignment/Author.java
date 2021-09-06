package com.techment.Assignment;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "author500")
@Entity
//@NamedQuery(name ="findAllProduct",query="select p from Product p")
public class Author {

	@Id
	private int authorId;
	private String firstName;
	private String lastName;
	private int phoneNo;
	
	
	
	
	
	public Author(int authorId, String firstName, String lastName, int phoneNo) {
		super();
		this.authorId = authorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}
	public Author() {
		super();
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", firstName=" + firstName + 
				", lastName=" + lastName + ", phoneNo=" + phoneNo + "]";
	}
	
	
	
	
}
