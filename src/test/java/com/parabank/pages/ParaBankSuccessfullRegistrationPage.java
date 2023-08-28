package com.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.parabank.objectrepository.ObjectRepository;

public class ParaBankSuccessfullRegistrationPage {
	public WebDriver driver;

	public ParaBankSuccessfullRegistrationPage(WebDriver driver) {
		this.driver = driver;
	}

	// Initilize the webelements locators values using FINDBY class
	@FindBy(xpath = ObjectRepository.successMessageTextXPath)
	@CacheLookup
	WebElement successMessageText;

	// Initilize the webelements locators values using FINDBY class
	@FindBy(xpath = ObjectRepository.logOutLinkXPath)
	@CacheLookup
	WebElement logOutLink;

	//Reusable Methods
	public void validateSuccessfullRegistrationMessage(String expectedSuccessMsg) {
		String SuccessMsg = successMessageText.getText();
		int endIndex = SuccessMsg.indexOf(".");
		String actualSuccessMsg = SuccessMsg.substring(0, endIndex);

		if(actualSuccessMsg.equals(expectedSuccessMsg)) {
			Reporter.log("Actual and Expected Successful Message Text are same");
			Reporter.log("The Successful Message Text is: " + actualSuccessMsg); 
		} 
		else 
		{
			Reporter.log("Actual and Expected Successful Message Text are not same"); 
			Reporter.log("Actual Successful Message Text is "+actualSuccessMsg);
			Reporter.log("Expected Successful Message Text is " +expectedSuccessMsg); 
		}	
	}

	public void clickLogoutButton() {
		logOutLink.click();
		Reporter.log("User Successfully Logged Out of ParaBank Application");
	}

}
