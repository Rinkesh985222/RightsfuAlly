package com.RightsfuAlly.TestCases;

import org.testng.Assert;
import org.testng.annotations.*;
import com.RightsfuAlly.Utilities.DataProviderClass;
import com.RightsfuAlly.PageObject.HomePage;
import com.RightsfuAlly.PageObject.SignInPage;
import com.RightsfuAlly.PageObject.OtpVerificationPage;


public class SignInViaEmailWithMobileVerification extends openUrl  {

	@Test(dataProvider="LoginData",dataProviderClass=DataProviderClass.class)
	public void signInViaEmailWithMobileVerificationByNewOrVerifiedEmailAndNewContact(String email,String contact) throws InterruptedException {

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
		sIP.clickSendOtpForContactNumberVerification();
			
		oVP.enterOtp();
		oVP.clickEnterForOtpVerification();
		
		Assert.assertTrue(driver.getCurrentUrl().equals(url));
	}



	@Test(dataProvider="LoginData",dataProviderClass=DataProviderClass.class)
	public void signInViaEmailWithMobileVerificationByNewOrVerifiedEmailAndVerifiedContact(String email,String contact) throws InterruptedException {

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
		sIP.clickSendOtpForContactNumberVerification();
			
		oVP.enterOtp();
		oVP.clickEnterForOtpVerification();
		
		Assert.assertTrue(driver.getCurrentUrl().equals(url));	
	}
	
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviderClass.class)
	public void signInViaEmailWithMobileVerificationByNewOrVerifiedEmailAndAssociatedUnverifiedContact(String email,String contact) throws InterruptedException {

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
		sIP.clickSendOtpForContactNumberVerification();
			
		oVP.enterOtp();
		oVP.clickEnterForOtpVerification();
		
		Assert.assertTrue(driver.getCurrentUrl().equals(url));		
	}
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviderClass.class)
	public void signInViaEmailWithMobileVerificationByNewOrVerifiedEmailAndExistingContact(String email,String contact) throws InterruptedException {

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
		sIP.clickSendOtpForContactNumberVerification(); 
		Assert.assertTrue(driver.getCurrentUrl().contains(contactUrl));
	} 
	
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviderClass.class)
	public void signInViaEmailWithMobileVerificationByNewOrVerifiedEmailAndAssociatedVerifiedContact(String email,String contact) throws InterruptedException {

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
		sIP.clickSendOtpForContactNumberVerification();
		
		Assert.assertTrue(driver.getCurrentUrl().contains(contactUrl));	
	}
	
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviderClass.class)
	public void signInViaEmailByExistingEmail(String email,String contact) throws InterruptedException {

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
		
		Assert.assertTrue(driver.getCurrentUrl().equals(url));	
	}
	
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviderClass.class)
	public void signInViaEmailByAssociatedVerifiedEmail(String email,String contact) throws InterruptedException {

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
		
		Assert.assertTrue(driver.getCurrentUrl().equals(url));	
	}
	
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviderClass.class)
	public void signInViaEmailByAssociatedUnverifiedEmail(String email,String contact) throws InterruptedException {

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
		
		Assert.assertTrue(driver.getCurrentUrl().equals(url));	
	}	

}
