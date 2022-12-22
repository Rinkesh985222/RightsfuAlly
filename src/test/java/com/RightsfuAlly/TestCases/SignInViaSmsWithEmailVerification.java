package com.RightsfuAlly.TestCases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;

import com.RightsfuAlly.PageObject.VerifyLaterPage;
import com.RightsfuAlly.Utilities.DataProviderClass;
import com.RightsfuAlly.PageObject.HomePage;
import com.RightsfuAlly.PageObject.SignInPage;
import com.RightsfuAlly.PageObject.OtpVerificationPage;


public class SignInViaSmsWithEmailVerification extends openUrl  {

	@Test(dataProvider="LoginData",dataProviderClass=DataProviderClass.class)
	public void signInViaSmsWithEmailVerificationByNewOrVerifiedContactAndNewEmail
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
		vLP.clickOnSendOtpForEmailVerification();

		oVP.enterOtp();
		oVP.clickEnterForOtpVerification();
		
		Assert.assertTrue(driver.getCurrentUrl().equals(url));
	}


	@Test(dataProvider="LoginData",dataProviderClass=DataProviderClass.class)
	public void signInViaSmsWithEmailVerificationByNewOrVerifiedContactAndVerifiedEmail
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
		vLP.clickOnSendOtpForEmailVerification();

		oVP.enterOtp();
		oVP.clickEnterForOtpVerification();
		
		Assert.assertTrue(driver.getCurrentUrl().equals(url));
	} 

	@Test(dataProvider="LoginData",dataProviderClass=DataProviderClass.class)
	public void signInViaSmsWithEmailVerificationByNewOrVerifiedContactAndAssociatedUnverifiedEmail
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
		vLP.clickOnSendOtpForEmailVerification();

		oVP.enterOtp();
		oVP.clickEnterForOtpVerification();
		
		Assert.assertTrue(driver.getCurrentUrl().equals(url));
	} 

	@Test(dataProvider="LoginData",dataProviderClass=DataProviderClass.class)
	public void signInViaSmsWithEmailVerificationByNewOrVerifiedContactAndExistingEmail
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
		vLP.clickOnSendOtpForEmailVerification();
		
		Assert.assertTrue(driver.getCurrentUrl().contains(emailUrl));
	} 



	@Test(dataProvider="LoginData",dataProviderClass=DataProviderClass.class)
	public void signInViaSmsWithEmailVerificationByNewOrVerifiedContactAndAssociatedVerifiedEmail
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
		vLP.clickOnSendOtpForEmailVerification();
		
		Assert.assertTrue(driver.getCurrentUrl().contains(emailUrl));
	} 

	@Test(dataProvider="LoginData",dataProviderClass=DataProviderClass.class)
	public void signInViaSmsByExistingContact
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
		
		Assert.assertTrue(driver.getCurrentUrl().equals(url));
	}	

	@Test(dataProvider="LoginData",dataProviderClass=DataProviderClass.class)
	public void signInViaSmsByAssociatedVerifiedContact 
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
		
		Assert.assertTrue(driver.getCurrentUrl().equals(url));
	}	


	@Test(dataProvider="LoginData",dataProviderClass=DataProviderClass.class)
	public void signInViaSmsByAssociatedUnverifiedContact  
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
		
		Assert.assertTrue(driver.getCurrentUrl().equals(url));
	}	
}
