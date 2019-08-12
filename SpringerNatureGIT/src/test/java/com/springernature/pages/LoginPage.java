package com.springernature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy; 
public class LoginPage {
	
	   WebDriver driver;   
       public LoginPage(WebDriver ldriver)
       {
    	   this.driver = ldriver;
       }
       
       @FindBy (id="login-box-email") WebElement UserName;
       
       @FindBy (id="login-box-pw") WebElement PassWord;
       
       @FindBy (xpath="//*[@title='Log in']") WebElement LoginButton;
       
       @FindBy (xpath="//*[@class='text ui-autocomplete-input']") WebElement SearchText;
       
       @FindBy (xpath="//*[@class='search-submit']") WebElement SearchSubmit;
       
       
       public void LoginToSpringer(String ApplicationUsername, String Applicationpassword, String Text)
       {
    	   
    	   try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
    	   UserName.sendKeys(ApplicationUsername);
    	   PassWord.sendKeys(Applicationpassword);
    	   LoginButton.click();
    	   SearchText.sendKeys(Text);
    	   SearchSubmit.click();
       }
       
       
       

}

