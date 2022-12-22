package com.RightsfuAlly.TestCases;

import org.testng.Assert;
import org.testng.annotations.*;
import com.RightsfuAlly.PageObject.VerifyLaterPage;
import com.RightsfuAlly.Utilities.DataProviderClass;
import com.RightsfuAlly.PageObject.HomePage;
import com.RightsfuAlly.PageObject.SignInPage;
import com.RightsfuAlly.PageObject.OtpVerificationPage;


public class SignInViaEmailWithMobileVerificationLater extends openUrl  {


	@Test(dataProvider="LoginData",dataProviderClass=DataProviderClass.class)
	public void signInViaEmailWithMobileVerificationLaterByNewOrVerifiedEmailAndNewContact(String email,String contact) throws InterruptedException {

		System.out.println(contact);
        System.out.println(email);
		
		HomePage hP=new HomePage(driver);
		hP.clickOnSignIn();
		
		SignInPage sIP=new SignInPage(driver);
		sIP.clickSignInViaEmail();;
		sIP.enterEmail(email);
		sIP.clickSendOtpForEmailVerification();

        OtpVerificationPage oVP=new OtpVerificationPage(driver);
		oVP.enterOtp();
		oVP.clickEnterForOtpVerification();

		sIP.enterContactNumber(contact);
		VerifyLaterPage mobile=new VerifyLaterPage(driver);
		mobile.clickOnVeryfyLater();
		
		Assert.assertTrue(driver.getCurrentUrl().equals(url));	
	}
	

	@Test(dataProvider="LoginData",dataProviderClass=DataProviderClass.class)
	public void signInViaEmailWithMobileVerificationLaterByNewOrVerifiedEmailAndVerifiedContact(String email,String contact) throws InterruptedException {

		System.out.println(contact);
        System.out.println(email);
		
		HomePage hP=new HomePage(driver);
		hP.clickOnSignIn();
		
		SignInPage sIP=new SignInPage(driver);
		sIP.clickSignInViaEmail();;
		sIP.enterEmail(email);
		sIP.clickSendOtpForEmailVerification();

        OtpVerificationPage oVP=new OtpVerificationPage(driver);
		oVP.enterOtp();
		oVP.clickEnterForOtpVerification();

		sIP.enterContactNumber(contact);
		VerifyLaterPage mobile=new VerifyLaterPage(driver);
		mobile.clickOnVeryfyLater();
		
		Assert.assertTrue(driver.getCurrentUrl().equals(url));	
	}
	
	

	@Test(dataProvider="LoginData",dataProviderClass=DataProviderClass.class)
	public void signInViaEmailWithMobileVerificationLaterByNewOrVerifiedEmailAndAssociatedUnverifiedContact(String email,String contact) throws InterruptedException {

		System.out.println(contact);
        System.out.println(email);
		
		HomePage hP=new HomePage(driver);
		hP.clickOnSignIn();
		
		SignInPage sIP=new SignInPage(driver);
		sIP.clickSignInViaEmail();;
		sIP.enterEmail(email);
		sIP.clickSendOtpForEmailVerification();

        OtpVerificationPage oVP=new OtpVerificationPage(driver);
		oVP.enterOtp();
		oVP.clickEnterForOtpVerification();

		sIP.enterContactNumber(contact);
		VerifyLaterPage mobile=new VerifyLaterPage(driver);
		mobile.clickOnVeryfyLater();
		
		Assert.assertTrue(driver.getCurrentUrl().equals(url));	
	}
	
	

	@Test(dataProvider="LoginData",dataProviderClass=DataProviderClass.class)
	public void signInViaEmailWithMobileVerificationLaterByNewOrVerifiedEmailAndExistingContact(String email,String contact) throws InterruptedException {

		System.out.println(contact);
        System.out.println(email);
		
		HomePage hP=new HomePage(driver);
		hP.clickOnSignIn();
		
		SignInPage sIP=new SignInPage(driver);
		sIP.clickSignInViaEmail();;
		sIP.enterEmail(email);
		sIP.clickSendOtpForEmailVerification();

        OtpVerificationPage oVP=new OtpVerificationPage(driver);
		oVP.enterOtp();
		oVP.clickEnterForOtpVerification();

		sIP.enterContactNumber(contact);
		VerifyLaterPage mobile=new VerifyLaterPage(driver);
		mobile.clickOnVeryfyLater();
		
		Assert.assertTrue(driver.getCurrentUrl().contains(contactUrl));
	}
	
	

	@Test(dataProvider="LoginData",dataProviderClass=DataProviderClass.class)
	public void signInViaEmailWithMobileVerificationLaterByNewOrVerifiedEmailAndAssociatedVerifiedContact(String email,String contact) throws InterruptedException {

		System.out.println(contact);
        System.out.println(email);
		
		HomePage hP=new HomePage(driver);
		hP.clickOnSignIn();
		
		SignInPage sIP=new SignInPage(driver);
		sIP.clickSignInViaEmail();;
		sIP.enterEmail(email);
		sIP.clickSendOtpForEmailVerification();

        OtpVerificationPage oVP=new OtpVerificationPage(driver);
		oVP.enterOtp();
		oVP.clickEnterForOtpVerification();

		sIP.enterContactNumber(contact);
		VerifyLaterPage mobile=new VerifyLaterPage(driver);
		mobile.clickOnVeryfyLater();
		
		Assert.assertTrue(driver.getCurrentUrl().contains(contactUrl));	
	}
}
