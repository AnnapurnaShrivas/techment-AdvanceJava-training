package com.techment.model;

public class Bank {

	String bankName;
	String ifscCode;
	String branch;
	
	
	
	//setter only
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
//	public void setBranch(String branch) {
//		this.branch = branch;
//	}
	
	public Bank(String branch) {
		super();
		this.branch = branch;
	}
	
	
	
	public void displayBankDetails()
	{
		System.out.println("Name = "+bankName);
		System.out.println("IFSC Code = "+ifscCode);
		System.out.println("Branch = "+branch);
		
	}
	
	
	
}
