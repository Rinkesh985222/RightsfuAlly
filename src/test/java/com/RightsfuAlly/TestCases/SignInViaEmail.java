package com.RightsfuAlly.TestCases;

import org.testng.annotations.*;
import com.RightsfuAlly.PageObject.VerifyLaterPage;
import com.RightsfuAlly.PageObject.HomePage;
import com.RightsfuAlly.PageObject.SignInPage;
import com.RightsfuAlly.PageObject.OtpVerificationPage;


public class SignInViaEmail extends openUrl  {

	@Test
	public void signInViaEmailWithMobileVerification() throws InterruptedException {
		
		HomePage hP=new HomePage(driver);
		hP.clickOnSignIn();
		
		SignInPage sIP=new SignInPage(driver);
		sIP.clickSignInViaEmail();;
		sIP.enterEmail("obc@def.com");
		sIP.clickSendOtpForEmailVerification();

        OtpVerificationPage oVP=new OtpVerificationPage(driver);
		oVP.enterOtp();
		oVP.clickEnterForOtpVerification();
		
		if(driver.getCurrentUrl().equals("https://nft.tfhy.in/en/"))
		{
			System.out.println("Sign in via Email by existing email id or associated verified email id or associated unverified email id expect Sign in successfull");				
		}
		else
		{
			sIP.enterContactNumber("1534567899");
			sIP.clickSendOtpForContactNumberVerification();
			
			if(driver.getCurrentUrl().contains("https://nft.tfhy.in/en/users/otp-verification"))
			{
				oVP.enterOtp();
				oVP.clickEnterForOtpVerification();
				System.out.println("Sign in via Email by new or verified email id with new or verified or associated unverified contact number expect login successfull");
			}
			else
			{
				System.out.println("Sign in via Email by new or verified email id with existing or associated verified contact number expect error message 'contact number already exist'");
				
			}
		}
		
	}



	@Test
	public void signInViaEmailWithMobileVerificationLater() throws InterruptedException {

		HomePage hP=new HomePage(driver);
		hP.clickOnSignIn();
		
		SignInPage sIP=new SignInPage(driver);
		sIP.clickSignInViaEmail();;
		sIP.enterEmail("zdc@def.com");
		sIP.clickSendOtpForEmailVerification();

        OtpVerificationPage oVP=new OtpVerificationPage(driver);
		oVP.enterOtp();
		oVP.clickEnterForOtpVerification();

		if(driver.getCurrentUrl().equals("https://nft.tfhy.in/en/"))
		{
			System.out.println("Sign in via Email by existing email id or associated verified email id or associated unverified email id expect Sign in successfull");				
		}
		else
		{
			sIP.enterContactNumber("2434567890");
			VerifyLaterPage mobile=new VerifyLaterPage(driver);
		    mobile.clickOnVeryfyLater();
		
		if(driver.getCurrentUrl().equals("https://nft.tfhy.in/en/"))
		{
		System.out.println("Sign in via Email by new/verified email id with new or veryfied or associated unverified contact number expect login successfull");
		}
		
//		else if(driver.getCurrentUrl().contains("https://plancheck.tfhy.in/en/users/otp-verification/Mjg"))
//		
//		{
//			oVP.enterOtp();
//			oVP.clickEnterForOtpVerification();
//			
//			System.out.println("Sign in via Email by new or verified email id with veryfied or associated unverified contact number expect contact number verification first and then login successfull");
//		}
		
		else
		{
			System.out.println("Sign in via Email by new/verified email id with existing or associated verified contact number expect error message 'contact number already exist'");
		}
		}

	}
	
	@Test
	public void signInViaEmailUpToEmailVerification() throws InterruptedException {

		HomePage hP=new HomePage(driver);
		hP.clickOnSignIn();
		
		SignInPage sIP=new SignInPage(driver);
		sIP.clickSignInViaEmail();;
		sIP.enterEmail("jbc@def.com");
		sIP.clickSendOtpForEmailVerification();

        OtpVerificationPage oVP=new OtpVerificationPage(driver);
		oVP.enterOtp();
		oVP.clickEnterForOtpVerification();
			
	}
		

}
