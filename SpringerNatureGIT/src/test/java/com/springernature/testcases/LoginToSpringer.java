package com.springernature.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.springernature.pages.BaseClass;
import com.springernature.pages.LoginPage;


public class LoginToSpringer extends BaseClass {
	
	
     
	  @Test
      public void LoginApp()
      {
    	  LoginPage loginpage= PageFactory.initElements(driver, LoginPage.class);
    	  loginpage.LoginToSpringer("siddharthmathur29@gmail.com", "Springer@123", "Functional");
      }
	 

}