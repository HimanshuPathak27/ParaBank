package com.parabank.objectrepository;

public class ObjectRepository {

	// Object Repository of ParaBank Project

	//Home Page Object Repository
	public static final String registerLinkXPath = "//a[normalize-space()='Register']";

	//Register Customer Page Object Repository
	public static final String firstNameXPath = "//input[@id='customer.firstName']";
	public static final String lastNameXPath = "//input[@id='customer.lastName']";
	public static final String addressXPath = "//input[@id='customer.address.street']";
	public static final String cityXpath = "//input[@id='customer.address.city']";
	public static final String stateXPath = "//input[@id='customer.address.state']";
	public static final String zipCodeXPath = "//input[@id='customer.address.zipCode']";
	public static final String phoneNumberXPath = "//input[@id='customer.phoneNumber']";
	public static final String ssnNumberXPath = "//input[@id='customer.ssn']";
	public static final String userNameXPath = "//input[@id='customer.username']";
	public static final String passwordXPath = "//input[@id='customer.password']";
	public static final String confirmPasswordXPath = "//input[@id='repeatedPassword']";
	public static final String submitButtonXpath = "//input[@value='Register']";

	//Successfull Registration Page Object Repository
	public static final String successMessageTextXPath = "//p[contains(text(),'Your account was created successfully')]";
	public static final String logOutLinkXPath = "//a[normalize-space()='Log Out']";

}
