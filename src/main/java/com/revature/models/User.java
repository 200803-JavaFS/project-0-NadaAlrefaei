package com.revature.models;

public class User {
	
	
	
	
	public User() {
		super();
	}


	public User(int userID, String userName, String userType, String firstName, String lastName, int sSN,
			String bdate) {
		super();
		UserID = userID;
		UserName = userName;
		UserType = userType;
		this.firstName = firstName;
		this.lastName = lastName;
		SSN = sSN;
		Bdate = bdate;
	}
	private int UserID;
	public String UserName;
	public String UserType;
	public String firstName;
	public String lastName;
	private int SSN;
	private String Bdate;
	public int getUserID() {
		return UserID;
	}
	
	
	public void setUserID(int userID) {
		UserID = userID;
	}
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int sSN) {
		SSN = sSN;
	}
	public String getBdate() {
		return Bdate;
	}
	public void setBdate(String bdate) {
		Bdate = bdate;
	} 
	
	

}
