package com.odev.soru7;

import java.util.Date;

public class SalesReport extends Report{
	
	public SalesReport(String name, String result, Date createDate) {
		super(name, result, createDate);
	}

	private String[] authorizedDepartments;
	

	public String[] getAuthorizedDepartments() {
		return authorizedDepartments;
	}

	public void setAuthorizedDepartments(String[] authorizedDepartments) {
		this.authorizedDepartments = authorizedDepartments;
	}

	
}
