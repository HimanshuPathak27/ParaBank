package com.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.parabank.objectrepository.ObjectRepository;

public class ParaBankHomePage {
	public WebDriver driver;

	public ParaBankHomePage(WebDriver driver) {
		this.driver = driver;
	}

	// Initilize the webelements locators values using FINDBY class
	@FindBy(xpath = ObjectRepository.registerLinkXPath)
	@CacheLookup
	WebElement registerLink;

	//Reusable Methods
	public void navigateToSignUpPage() {
		registerLink.click();
		Reporter.log("Successfully Navigated to Sign Up Page");
	}
}