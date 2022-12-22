package com.RightsfuAlly.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RightsfuAlly.TestCases.openUrl;

public class OtpVerificationPage extends openUrl {

	WebDriver ldriver;
	public OtpVerificationPage(WebDriver rdriver) {

		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(xpath="//input[@id='otp_box']") WebElement otpField;
	@FindBy(css="button[class='btn btn-gradient']") WebElement enter;

	public void enterOtp() throws InterruptedException {
		String currentWindow=ldriver.getWindowHandle();
		ldriver.switchTo().newWindow(WindowType.TAB);
		ldriver.get(adminUrl);
		ldriver.findElement(By.xpath("//a[normalize-space()='Sign in via Email']")).click();
		ldriver.findElement(By.cssSelector("input[name='email'][id='id_email']")).sendKeys("demouser@gmail.com");
		ldriver.findElement(By.name("sign_in")).click();
		ldriver.findElement(By.name("otp")).sendKeys("123456");
		ldriver.findElement(By.xpath("//button[normalize-space()='Enter']")).click();
		ldriver.get(adminLoginUrl);

		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("document.querySelector('#sidebar').scrollTop=700");

		ldriver.findElement(By.xpath("//a[normalize-space()='Users']//i[@class='fa fa-angle-right']")).click();
		js.executeScript("document.querySelector('#sidebar').scrollTop=1500");

		ldriver.findElement(By.xpath("//a[normalize-space()='User otp']")).click();
		String otp=ldriver.findElement(By.className("field-otp")).getText();
		ldriver.findElement(By.xpath("//img[@src='https://static.tfhy.in/admin/img/user.png']")).click();
		ldriver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
		
		Thread.sleep(5000);
		ldriver.close();
		ldriver.switchTo().window(currentWindow);
        otpField.sendKeys(otp);
        
	}

	public void clickEnterForOtpVerification() {

		enter.click();
	}

}


