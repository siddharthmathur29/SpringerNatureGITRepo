package com.springernature.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory 
{
    public static WebDriver driver;
    
	public static WebDriver StartApplication(String BrowserName,String appURL)
	{
		if(BrowserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:/Users/sid/Downloads/chromedriver_win32/chromedriver.exe");
			 driver = new ChromeDriver();
			
		}
		else if(BrowserName.equals("Firefox"))
		{
			
		System.setProperty("wedriver.gecko.driver", "C:/Users/sid/Downloads/geckodriver-v0.24.0-win32/geckodriver.exe");
		driver = new FirefoxDriver();
		
		}
		else
		{
			System.out.println("We do not support this browser");
		}
		
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(appURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
}

   public static void ExitBrowser(WebDriver driver)
   {
	   driver.quit();
   }
} 
