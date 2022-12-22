package com.RightsfuAlly.TestCases;



import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.RightsfuAlly.Utilities.Readconfig;

import io.github.bonigarcia.wdm.WebDriverManager;


public class openUrl {

	public static WebDriver driver;

	Readconfig readconfig=new Readconfig();
	String url=readconfig.getbaseurl();
	String contactUrl=readconfig.getContactUrl();
	String emailUrl=readconfig.getEmailtUrl();
	protected String adminUrl=readconfig.getAdminUrl();
	protected String adminLoginUrl=readconfig.getAdminLoginUrl();
	String browser="chrome";

	@BeforeMethod
	public void urlSetUp()   {

		switch(browser)
		{

		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "msedge":
			WebDriverManager.chromedriver().setup();
			driver=new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.chromedriver().setup();
			driver=new FirefoxDriver();
			break;

		default:
			WebDriverManager.chromedriver().setup();
			driver = null;
			break;

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();	

	}

	public String captureScreenshot()  {

		TakesScreenshot screenshot= (TakesScreenshot)driver;
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"//screenshots//"+System.currentTimeMillis()+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return dest.getAbsolutePath(); 

	} 
}
