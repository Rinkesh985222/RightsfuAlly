package com.RightsfuAlly.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {

	Properties properties;

	String path="C:\\Users\\admin\\Desktop\\framework\\RightsfuAlly\\configuration\\config.properties";

	public Readconfig() {


		try {
			properties = new Properties();
			FileInputStream fis = new FileInputStream(path);

			properties.load(fis);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public  String getbaseurl() {

		String value=properties.getProperty("baseurl");
		if(value!=null) 
			return value;
		else
			throw new RuntimeException("baseurl not specified in config file");
	}

	public String getbrowser() {

		String value=properties.getProperty("browser");
		if(value!=null) 
			return value;
		else
			throw new RuntimeException("browser not specified in config file");
	}

	public String getContactUrl() {

		String value=properties.getProperty("contactUrl");
		if(value!=null) 
			return value;
		else
			throw new RuntimeException("contactUrl not specified in config file");
	}


	public String getEmailtUrl() {

		String value=properties.getProperty("emailUrl");
		if(value!=null) 
			return value;
		else
			throw new RuntimeException("emailUrl not specified in config file");
	}
	
	public String getAdminUrl() {

		String value=properties.getProperty("adminUrl");
		if(value!=null) 
			return value;
		else
			throw new RuntimeException("adminUrl not specified in config file");
	}
	
	public String getAdminLoginUrl() {

		String value=properties.getProperty("adminLoginUrl");
		if(value!=null) 
			return value;
		else
			throw new RuntimeException("adminLoginUrl not specified in config file");
	}





}



