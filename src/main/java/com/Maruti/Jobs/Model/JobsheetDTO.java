package com.Maruti.Jobs.Model;

public class JobsheetDTO {
	
	private String userName;
	
	private String email;
	
	
	

	public JobsheetDTO() {
		super();
	}

	public JobsheetDTO(String userName, String email) {
		super();
		this.userName = userName;
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
