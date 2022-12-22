package com.RightsfuAlly.Utilities;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider(name="LoginData")
	public String[][] LoginDataProvider(Method name) throws IOException{

		String fileName= "C:\\Users\\admin\\Desktop\\framework\\RightsfuAlly\\TestData\\DataProvider.xlsx";
		int ttlRows=ReadExcel.getRowCount(fileName, "Sheet5");
		int ttlColumns=ReadExcel.getColCount(fileName, "Sheet5");
		
		String data[][]=new String[ttlRows-26][ttlColumns-2];
		
		if(name.getName().equals("signInViaSmsWithEmailVerificationByNewOrVerifiedContactAndNewEmail")) {
        for(int i=1;i<2;i++) {
			for(int j=2;j<4;j++) {
             data[i-1][j-2]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
			}
		}
		}
        
        if(name.getName().equals("signInViaSmsWithEmailVerificationByNewOrVerifiedContactAndVerifiedEmail")) {
            for(int i=2;i<3;i++) {
    			for(int j=2;j<4;j++) {
                 data[i-2][j-2]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
    			}
    		}
        
  		}
        
        if(name.getName().equals("signInViaSmsWithEmailVerificationByNewOrVerifiedContactAndAssociatedUnverifiedEmail")) {
            for(int i=3;i<4;i++) {
    			for(int j=2;j<4;j++) {
                 data[i-3][j-2]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
    			}
    		}
        
  		}
        
        if(name.getName().equals("signInViaSmsWithEmailVerificationByNewOrVerifiedContactAndExistingEmail")) {
            for(int i=4;i<5;i++) {
    			for(int j=2;j<4;j++) {
                 data[i-4][j-2]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
    			}
    		}
        
  		}
        
        if(name.getName().equals("signInViaSmsWithEmailVerificationByNewOrVerifiedContactAndAssociatedVerifiedEmail")) {
            for(int i=5;i<6;i++) {
    			for(int j=2;j<4;j++) {
                 data[i-5][j-2]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
    			}
    		}
        
  		}
        
        if(name.getName().equals("signInViaSmsByExistingContact")) {
            for(int i=6;i<7;i++) {
    			for(int j=2;j<4;j++) {
                 data[i-6][j-2]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
    			}
    		}
        
  		}
        
        
        if(name.getName().equals("signInViaSmsByAssociatedVerifiedContact")) {
            for(int i=7;i<8;i++) {
    			for(int j=2;j<4;j++) {
                 data[i-7][j-2]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
    			}
    		}
        
  		}
        
        
        if(name.getName().equals("signInViaSmsByAssociatedUnverifiedContact")) {
            for(int i=8;i<9;i++) {
    			for(int j=2;j<4;j++) {
                 data[i-8][j-2]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
    			}
    		}
        
  		}
        
        if(name.getName().equals("signInViaSMSWithEmailVerificationLaterByNewOrVerifiedContactAndNewEmail")) {
            for(int i=9;i<10;i++) {
    			for(int j=2;j<4;j++) {
                 data[i-9][j-2]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
    			}
    		}
        
  		}
        
        if(name.getName().equals("signInViaSmsWithEmailVerificationLaterByNewOrVerifiedContactAndVerifiedEmail")) {
            for(int i=10;i<11;i++) {
    			for(int j=2;j<4;j++) {
                 data[i-10][j-2]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
    			}
    		}
        
  		}
        
        if(name.getName().equals("signInViaSmsWithEmailVerificationLaterByNewOrVerifiedContactAndAssociatedUnverifiedEmail")) {
            for(int i=11;i<12;i++) {
    			for(int j=2;j<4;j++) {
                 data[i-11][j-2]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
    			}
    		}
        
  		}
        
        if(name.getName().equals("signInViaSmsWithEmailVerificationLaterByNewOrVerifiedContactAndExistingEmail")) {
            for(int i=12;i<13;i++) {
    			for(int j=2;j<4;j++) {
                 data[i-12][j-2]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
    			}
    		}
        
  		}
        
        if(name.getName().equals("signInViaSmsWithEmailVerificationLaterByNewOrVerifiedContactAndAssociatedVerifiedEmail")) {
            for(int i=13;i<14;i++) {
    			for(int j=2;j<4;j++) {
                 data[i-13][j-2]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
    			}
    		}
        
  		}
        
        if(name.getName().equals("signInViaEmailWithMobileVerificationByNewOrVerifiedEmailAndNewContact")) {
            for(int i=14;i<15;i++) {
    			for(int j=2;j<4;j++) {
                 data[i-14][j-2]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
    			}
    		}
        
  		}
        
        if(name.getName().equals("signInViaEmailWithMobileVerificationByNewOrVerifiedEmailAndVerifiedContact")) {
            for(int i=15;i<16;i++) {
    			for(int j=2;j<4;j++) {
                 data[i-15][j-2]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
    			}
    		}
        
  		}
        
        if(name.getName().equals("signInViaEmailWithMobileVerificationByNewOrVerifiedEmailAndAssociatedUnverifiedContact")) {
            for(int i=16;i<17;i++) {
    			for(int j=2;j<4;j++) {
                 data[i-16][j-2]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
    			}
    		}
        
  		}
        
        if(name.getName().equals("signInViaEmailWithMobileVerificationByNewOrVerifiedEmailAndExistingContact")) {
            for(int i=17;i<18;i++) {
    			for(int j=2;j<4;j++) {
                 data[i-17][j-2]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
    			}
    		}
        
  		}
        
        if(name.getName().equals("signInViaEmailWithMobileVerificationByNewOrVerifiedEmailAndAssociatedVerifiedContact")) {
            for(int i=18;i<19;i++) {
    			for(int j=2;j<4;j++) {
                 data[i-18][j-2]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
    			}
    		}
        
  		}
        
        if(name.getName().equals("signInViaEmailByExistingEmail")) {
            for(int i=19;i<20;i++) {
    			for(int j=2;j<4;j++) {
                 data[i-19][j-2]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
    			}
    		}
        
  		}
        
        if(name.getName().equals("signInViaEmailByAssociatedVerifiedEmail")) {
            for(int i=20;i<21;i++) {
    			for(int j=2;j<4;j++) {
                 data[i-20][j-2]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
    			}
    		}
        
  		}
        
        if(name.getName().equals("signInViaEmailByAssociatedUnverifiedEmail")) {
            for(int i=21;i<22;i++) {
    			for(int j=2;j<4;j++) {
                 data[i-21][j-2]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
    			}
    		}
        
  		}
        
        if(name.getName().equals("signInViaEmailWithMobileVerificationLaterByNewOrVerifiedEmailAndNewContact")) {
            for(int i=22;i<23;i++) {
    			for(int j=2;j<4;j++) {
                 data[i-22][j-2]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
    			}
    		}
        
  		}
        
        if(name.getName().equals("signInViaEmailWithMobileVerificationLaterByNewOrVerifiedEmailAndVerifiedContact")) {
            for(int i=23;i<24;i++) {
    			for(int j=2;j<4;j++) {
                 data[i-23][j-2]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
    			}
    		}
        
  		}
        
        if(name.getName().equals("signInViaEmailWithMobileVerificationLaterByNewOrVerifiedEmailAndAssociatedUnverifiedContact")) {
            for(int i=24;i<25;i++) {
    			for(int j=2;j<4;j++) {
                 data[i-24][j-2]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
    			}
    		}
        
  		}
        
        if(name.getName().equals("signInViaEmailWithMobileVerificationLaterByNewOrVerifiedEmailAndExistingContact")) {
            for(int i=25;i<26;i++) {
    			for(int j=2;j<4;j++) {
                 data[i-25][j-2]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
    			}
    		}
        
  		}
        
        if(name.getName().equals("signInViaEmailWithMobileVerificationLaterByNewOrVerifiedEmailAndAssociatedVerifiedContact")) {
            for(int i=26;i<27;i++) {
    			for(int j=2;j<4;j++) {
                 data[i-26][j-2]=ReadExcel.getCellValue(fileName, "Sheet5", i, j);
    			}
    		}
        
  		}
        
       
        
		return data;
	}

	

}
