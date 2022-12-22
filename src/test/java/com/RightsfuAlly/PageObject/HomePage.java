package com.RightsfuAlly.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver ldriver;
	public HomePage(WebDriver rdriver) {
		
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}

	@FindBy(xpath="//a[normalize-space()='Sign In']") WebElement signIn;
	@FindBy(xpath="//a[@class='nav-link active']") WebElement signInViaSms;
	@FindBy(xpath="//input[@id='phone']") WebElement contactNumber;
	
	public void clickOnSignIn() {

		signIn.click();
	}

	public void clickOnSignInViaSms() {

		signInViaSms.click();
	}

	public void clickOnContactNumber() {

		contactNumber.click();
	}


}
