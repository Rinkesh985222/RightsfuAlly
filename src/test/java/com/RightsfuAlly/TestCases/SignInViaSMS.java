package com.RightsfuAlly.TestCases;


import java.io.IOException;

import org.testng.annotations.*;

import com.RightsfuAlly.PageObject.VerifyLaterPage;
import com.RightsfuAlly.PageObject.HomePage;
import com.RightsfuAlly.PageObject.SignInPage;
import com.RightsfuAlly.PageObject.OtpVerificationPage;


public class SignInViaSMS extends openUrl  {

	@Test
	public void signInViaSmsWithEmailVerification() throws InterruptedException, IOException {
		
		HomePage hP=new HomePage(driver);
		hP.clickOnSignIn();
		hP.clickOnSignInViaSms();
		hP.clickOnContactNumber();

		SignInPage sIP=new SignInPage(driver);
		sIP.enterContactNumber("3234567890");
        sIP.clickSendOtpForContactNumberVerification();

		OtpVerificationPage oVP=new OtpVerificationPage(driver);
		oVP.enterOtp();
		oVP.clickEnterForOtpVerification();
		
		if(driver.getCurrentUrl().equals("https://plancheck.tfhy.in/en/"))
		{
			System.out.println("Sign in via SMS by existing contact number or associated verified contact number or associated unverified contact number expect Sign in successfull");
			
		}
		
		else
		{
			sIP.enterEmail("cbc@def.com");
			VerifyLaterPage vLP =new VerifyLaterPage(driver);
			vLP.clickOnSendOtpForEmailVerification();
			
			if(driver.getCurrentUrl().contains("https://nft.tfhy.in/en/users/email-otp-verification"))
			{
				oVP.enterOtp();
				oVP.clickEnterForOtpVerification();
			    System.out.println("Sign in via SMS by new/verified contact number with new or verified or associated unverified email id expect login successfull");
			}
			else
			{
				System.out.println("Sign in via SMS by new/verified contact number with existing or associated verified email id expect error message 'email already exist'");
				
			}
		}
	}


	@Test
	public void signInViaSmsWithEmailVerificationLater() throws InterruptedException {
      
		HomePage hP=new HomePage(driver);
		hP.clickOnSignIn();
		hP.clickOnSignInViaSms();
		hP.clickOnContactNumber();

		SignInPage sIP=new SignInPage(driver);
		sIP.enterContactNumber("1314567890");
        sIP.clickSendOtpForContactNumberVerification();	
        
        OtpVerificationPage oVP=new OtpVerificationPage(driver);
		oVP.enterOtp();
		oVP.clickEnterForOtpVerification();
        
		if(driver.getCurrentUrl().equals("https://nft.tfhy.in/en/"))
		{
			System.out.println("Sign in via SMS by existing contact number or associated verified contact number or associated unverified contact number expect Sign in successfull");				
		}
		else
		{
			sIP.enterEmail("ebc@def.com");
			VerifyLaterPage vLP =new VerifyLaterPage(driver);
		    vLP.clickOnVeryfyLater();

		if(driver.getCurrentUrl().equals("https://nft.tfhy.in/en/"))
		{
		System.out.println("Sign in via SMS by new/verified contact number with new or verified email id expect login successfull");
		}
		
		else if(driver.getCurrentUrl().contains("https://nft.tfhy.in/en/users/email-otp-verification"))
		
		{
			oVP.enterOtp();
			oVP.clickEnterForOtpVerification();
			System.out.println("Sign in via SMS by new/verified contact number with associated unverified email id expect email verification first and then login successfull");
		}
		
		else
		{
			System.out.println("Sign in via SMS by new/verified contact number with existing or associated verified email id expect error message 'email already exist'");
		}
		}

	}
	
	@Test
	public void signInViaSmsWithMobileVerification() throws InterruptedException {

		HomePage hP=new HomePage(driver);
		hP.clickOnSignIn();
		hP.clickOnSignInViaSms();
		hP.clickOnContactNumber();

		SignInPage sIP=new SignInPage(driver);
		sIP.enterContactNumber("2334567890");
        sIP.clickSendOtpForContactNumberVerification();

		OtpVerificationPage oVP=new OtpVerificationPage(driver);
		oVP.enterOtp();
		oVP.clickEnterForOtpVerification();
	}
}
