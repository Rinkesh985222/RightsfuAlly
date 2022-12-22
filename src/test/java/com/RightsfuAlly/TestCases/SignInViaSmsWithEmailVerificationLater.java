package com.RightsfuAlly.TestCases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;

import com.RightsfuAlly.PageObject.VerifyLaterPage;
import com.RightsfuAlly.Utilities.DataProviderClass;
import com.RightsfuAlly.PageObject.HomePage;
import com.RightsfuAlly.PageObject.SignInPage;
import com.RightsfuAlly.PageObject.OtpVerificationPage;


public class SignInViaSmsWithEmailVerificationLater extends openUrl  {

	@Test(dataProvider="LoginData",dataProviderClass=DataProviderClass.class)
	public void signInViaSMSWithEmailVerificationLaterByNewOrVerifiedContactAndNewEmail
	(String contact,String email) throws InterruptedException, IOException {

		System.out.println(contact);
        System.out.println(email);
		
		HomePage hP=new HomePage(driver);
		hP.clickOnSignIn();
		hP.clickOnSignInViaSms();
		hP.clickOnContactNumber();

		SignInPage sIP=new SignInPage(driver);
		sIP.enterContactNumber(contact);
        sIP.clickSendOtpForContactNumberVerification();

		OtpVerificationPage oVP=new OtpVerificationPage(driver);
		oVP.enterOtp();
		oVP.clickEnterForOtpVerification();
		
		sIP.enterEmail(email);
	    VerifyLaterPage vLP =new VerifyLaterPage(driver);
		vLP.clickOnVeryfyLater();
		
		Assert.assertTrue(driver.getCurrentUrl().equals(url));	
	}
	
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviderClass.class)
	public void signInViaSmsWithEmailVerificationLaterByNewOrVerifiedContactAndVerifiedEmail
     (String contact,String email) throws InterruptedException, IOException {

		System.out.println(contact);
        System.out.println(email);
		
		HomePage hP=new HomePage(driver);
		hP.clickOnSignIn();
		hP.clickOnSignInViaSms();
		hP.clickOnContactNumber();

		SignInPage sIP=new SignInPage(driver);
		sIP.enterContactNumber(contact);
        sIP.clickSendOtpForContactNumberVerification();

		OtpVerificationPage oVP=new OtpVerificationPage(driver);
		oVP.enterOtp();
		oVP.clickEnterForOtpVerification();
		
		sIP.enterEmail(email);
	    VerifyLaterPage vLP =new VerifyLaterPage(driver);
		vLP.clickOnVeryfyLater();
		
		Assert.assertTrue(driver.getCurrentUrl().equals(url));	
	} 
		
	@Test(dataProvider="LoginData",dataProviderClass=DataProviderClass.class)
	public void signInViaSmsWithEmailVerificationLaterByNewOrVerifiedContactAndAssociatedUnverifiedEmail
     (String contact,String email) throws InterruptedException, IOException {

		System.out.println(contact);
        System.out.println(email);
		
		HomePage hP=new HomePage(driver);
		hP.clickOnSignIn();
		hP.clickOnSignInViaSms();
		hP.clickOnContactNumber();

		SignInPage sIP=new SignInPage(driver);
		sIP.enterContactNumber(contact);
        sIP.clickSendOtpForContactNumberVerification();

		OtpVerificationPage oVP=new OtpVerificationPage(driver);
		oVP.enterOtp();
		oVP.clickEnterForOtpVerification();
		
		sIP.enterEmail(email);
	    VerifyLaterPage vLP =new VerifyLaterPage(driver);
		vLP.clickOnVeryfyLater();
		
		oVP.enterOtp();
		oVP.clickEnterForOtpVerification();
		
		Assert.assertTrue(driver.getCurrentUrl().equals(url));	
	} 
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviderClass.class)
	public void signInViaSmsWithEmailVerificationLaterByNewOrVerifiedContactAndExistingEmail
     (String contact,String email) throws InterruptedException, IOException {

		System.out.println(contact);
        System.out.println(email);
		
		HomePage hP=new HomePage(driver);
		hP.clickOnSignIn();
		hP.clickOnSignInViaSms();
		hP.clickOnContactNumber();

		SignInPage sIP=new SignInPage(driver);
		sIP.enterContactNumber(contact);
        sIP.clickSendOtpForContactNumberVerification();

		OtpVerificationPage oVP=new OtpVerificationPage(driver);
		oVP.enterOtp();
		oVP.clickEnterForOtpVerification();
		
		sIP.enterEmail(email);
	    VerifyLaterPage vLP =new VerifyLaterPage(driver);
		vLP.clickOnVeryfyLater();
		
		Assert.assertTrue(driver.getCurrentUrl().contains(emailUrl));
	} 
	
	
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviderClass.class)
	public void signInViaSmsWithEmailVerificationLaterByNewOrVerifiedContactAndAssociatedVerifiedEmail
     (String contact,String email) throws InterruptedException, IOException {

		System.out.println(contact);
        System.out.println(email);
		
		HomePage hP=new HomePage(driver);
		hP.clickOnSignIn();
		hP.clickOnSignInViaSms();
		hP.clickOnContactNumber();

		SignInPage sIP=new SignInPage(driver);
		sIP.enterContactNumber(contact);
        sIP.clickSendOtpForContactNumberVerification();

		OtpVerificationPage oVP=new OtpVerificationPage(driver);
		oVP.enterOtp();
		oVP.clickEnterForOtpVerification();
		
		sIP.enterEmail(email);
	    VerifyLaterPage vLP =new VerifyLaterPage(driver);
		vLP.clickOnVeryfyLater();
		
		Assert.assertTrue(driver.getCurrentUrl().contains(emailUrl));
	} 
	

}
