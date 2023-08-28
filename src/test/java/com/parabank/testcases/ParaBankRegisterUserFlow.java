package com.parabank.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.parabank.driverscript.TestBase;
import com.parabank.pages.ParaBankHomePage;
import com.parabank.pages.ParaBankSignUpPage;
import com.parabank.pages.ParaBankSuccessfullRegistrationPage;

public class ParaBankRegisterUserFlow extends TestBase{

	@Test(priority = 1)
	public void validatingRegistrationPageNavigation() {
		ParaBankHomePage homePage = PageFactory.initElements(driver, ParaBankHomePage.class);
		homePage.navigateToSignUpPage();
	}

	@Test(priority = 2)
	public void registerUser() {
		ParaBankSignUpPage signUpPage = PageFactory.initElements(driver, ParaBankSignUpPage.class);
		signUpPage.enterFirstName("Himanshu");
		signUpPage.enterLastName("Pathak");
		signUpPage.enterAddress("17/238 Z-16");
		signUpPage.enterCity("Gr. Noida");
		signUpPage.enterState("Uttar Pradesh");
		signUpPage.enterzipCode("201310");
		signUpPage.enterPhoneNumber("9897032120");
		signUpPage.enterSSNNumber("296013");
		signUpPage.enterUserName("Himanshu_@270998");
		signUpPage.enterPassword("QWERTY");
		signUpPage.enterConfirmationPassword("QWERTY");
		signUpPage.clickSubmitButton();
	}

	@Test(priority = 3)
	public void validatingSuccessfullRegisterMsg() {
		ParaBankSuccessfullRegistrationPage success = PageFactory.initElements(driver, ParaBankSuccessfullRegistrationPage.class);
		success.validateSuccessfullRegistrationMessage("Your account was created successfully");
	}

	@Test(priority = 4)
	public void validatingLogOut() {
		ParaBankSuccessfullRegistrationPage logout = PageFactory.initElements(driver, ParaBankSuccessfullRegistrationPage.class);
		logout.clickLogoutButton();
	}

}
