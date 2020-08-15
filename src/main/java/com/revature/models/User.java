package com.revature.models;

public class User {
	
	
	
	
	public User() {
		super();
	}


	public User(int userID, String userName, String userType, String firstName, String lastName, String bdate) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.userType = userType;
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.bDate = bdate;
	}
	private int userID;
	public String userName;
	public String userType;
	public String firstName;
	public String lastName;
	private String bDate;
	public int getUserID() {
		return userID;
	}
	
	
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public String getBdate() {
		return bDate;
	}
	public void setBdate(String bdate) {
		this.bDate = bdate;
	} 
	
	

}
