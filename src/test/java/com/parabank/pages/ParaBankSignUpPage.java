package com.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.parabank.objectrepository.ObjectRepository;

public class ParaBankSignUpPage {
	public WebDriver driver;

	public ParaBankSignUpPage(WebDriver driver) {
		this.driver = driver;
	}

	// Initilize the webelements locators values using FINDBY class
	@FindBy(xpath = ObjectRepository.firstNameXPath)
	@CacheLookup
	WebElement firstName;

	@FindBy(xpath = ObjectRepository.lastNameXPath)
	@CacheLookup
	WebElement lastName;

	@FindBy(xpath = ObjectRepository.addressXPath)
	@CacheLookup
	WebElement address;

	@FindBy(xpath = ObjectRepository.cityXpath)
	@CacheLookup
	WebElement city;

	@FindBy(xpath = ObjectRepository.stateXPath)
	@CacheLookup
	WebElement state;

	@FindBy(xpath = ObjectRepository.zipCodeXPath)
	@CacheLookup
	WebElement zipCode;

	@FindBy(xpath = ObjectRepository.phoneNumberXPath)
	@CacheLookup
	WebElement phoneNumber;

	@FindBy(xpath = ObjectRepository.ssnNumberXPath)
	@CacheLookup
	WebElement ssnNumber;

	@FindBy(xpath = ObjectRepository.userNameXPath)
	@CacheLookup
	WebElement userName;

	@FindBy(xpath = ObjectRepository.passwordXPath)
	@CacheLookup
	WebElement password;

	@FindBy(xpath = ObjectRepository.confirmPasswordXPath)
	@CacheLookup
	WebElement confirmPassword;

	@FindBy(xpath = ObjectRepository.submitButtonXpath)
	@CacheLookup
	WebElement submitButton;

	//Reusable Methods
	public void enterFirstName(String firstNameVaue) {
		firstName.sendKeys(firstNameVaue);
		Reporter.log("First Name entered is : " + firstNameVaue);
	}

	public void enterLastName(String lastNameVaue) {
		lastName.sendKeys(lastNameVaue);
		Reporter.log("Last Name entered is : " + lastNameVaue);
	}

	public void enterAddress(String addressValue) {
		address.sendKeys(addressValue);
		Reporter.log("Address entered is : " + addressValue);
	}

	public void enterCity(String cityValue) {
		city.sendKeys(cityValue);
		Reporter.log("City entered is : " + cityValue);
	}

	public void enterState(String stateValue) {
		state.sendKeys(stateValue);
		Reporter.log("State entered is : " + stateValue);
	}

	public void enterzipCode(String zipCodeValue) {
		zipCode.sendKeys(zipCodeValue);
		Reporter.log("Zip Code entered is : " + zipCodeValue);
	}

	public void enterPhoneNumber(String phoneNumberValue) {
		phoneNumber.sendKeys(phoneNumberValue);
		Reporter.log("phone Number entered is : " + phoneNumberValue);
	}

	public void enterSSNNumber(String ssnNumberValue) {
		ssnNumber.sendKeys(ssnNumberValue);
		Reporter.log("SSN Number entered is : " + ssnNumberValue);
	}

	public void enterUserName(String usernameValue) {
		userName.sendKeys(usernameValue);
		Reporter.log("Username entered is : " + usernameValue);
	}

	public void enterPassword(String passwordValue) {
		password.sendKeys(passwordValue);
		Reporter.log("Password entered is : " + passwordValue);
	}

	public void enterConfirmationPassword(String confirmPasswordValue) {
		confirmPassword.sendKeys(confirmPasswordValue);
		Reporter.log("Confirmation password entered is : " + confirmPasswordValue);
	}

	public void clickSubmitButton() {
		submitButton.click();
		Reporter.log("Submit Button is clicked successfully");
	}

}
