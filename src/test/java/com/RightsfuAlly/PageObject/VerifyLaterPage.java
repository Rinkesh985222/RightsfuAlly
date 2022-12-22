package com.RightsfuAlly.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyLaterPage {

	WebDriver ldriver;

	public VerifyLaterPage(WebDriver rdriver) {

		ldriver=rdriver;

		PageFactory.initElements(rdriver, this);

	}

	
	@FindBy(name="verify_later") WebElement veryfyLater;
	@FindBy(name="send_otp") WebElement sendOtpForEmailVerification;

	public void clickOnVeryfyLater() {

		veryfyLater.click();
	}
	
	public void clickOnSendOtpForEmailVerification() {

		sendOtpForEmailVerification.click();
	}



}
