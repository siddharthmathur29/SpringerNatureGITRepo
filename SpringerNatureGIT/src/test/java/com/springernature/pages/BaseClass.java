package com.springernature.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.springernature.utility.BrowserFactory;

public class BaseClass {

	public WebDriver driver;
	
	 @BeforeClass	
     public void Setup()
     {
   	  driver = BrowserFactory.StartApplication("Chrome", "https://link.springer.com/signup-login?previousUrl=https%3A%2F%2Flink.springer.com%2F");
     }
	 
	 @AfterClass
	  public void TearDown()
	  {
		  BrowserFactory.ExitBrowser(driver);
	  }
	
}
