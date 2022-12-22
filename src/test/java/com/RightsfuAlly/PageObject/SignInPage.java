package com.RightsfuAlly.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	WebDriver ldriver;
	public SignInPage(WebDriver rdriver) {

		ldriver=rdriver;

		PageFactory.initElements(rdriver, this);

	}

	@FindBy(id="phone") WebElement contactNumberField;
	@FindBy(name="send_otp") WebElement sendOtpForContactNumberVerification;
	@FindBy(xpath="//a[normalize-space()='Sign in via Email']") WebElement signInViaEmail;
	@FindBy(name="email") WebElement emailField;
	@FindBy(name="sign_in") WebElement sendOtpForEmailVerification;

	public void enterContactNumber(String contact) {

		contactNumberField.sendKeys(contact);

	}

	public void clickSendOtpForContactNumberVerification() {

		sendOtpForContactNumberVerification.click();

	}

	public void clickSignInViaEmail() {
		signInViaEmail.click();

	}

	public void enterEmail(String email) {
		emailField.sendKeys(email);

	}

	public void clickSendOtpForEmailVerification() {
		sendOtpForEmailVerification.click();

	}

}
