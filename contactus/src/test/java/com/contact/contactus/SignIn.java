package com.contact.contactus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.contact.contactusPageobject.LandingPageSignIn;

public class SignIn {

	    



	@Test(dataProvider = "signin")
	  public void signin(String username,String password) throws InterruptedException{
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\pratiksha.singhe\\Downloads\\chromedriver_win32//chromedriver.exe");



	   WebDriver driver = new ChromeDriver();
	    LandingPageSignIn  SignIn= new LandingPageSignIn(driver);
	    SignIn.goTo();
	  SignIn.Signin(username, password);
	}
	    @DataProvider
	   public Object[][] signin(){
	        Object[][] data = new Object[2][2];
	        
	        data[0][0]="pratiksha";
	        data[0][1]="pratt617";
	        
	        data[1][0]="12344";
	        data[1][1]="@#$$%%";
	        return data;
	    }
	   
	} 

