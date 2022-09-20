package com.contact.contactusPageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPageSignIn {



	   WebDriver driver;
	    public LandingPageSignIn(WebDriver driver)
	    {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	     @FindBy(css="button[type='submit']")
	     WebElement signinbutton;
	     
	     @FindBy(id="username")
	     WebElement Username;
	     
	     @FindBy(id="password")
	     WebElement Password;



	    @FindBy(xpath="//*[@type='submit']")
	     WebElement login;
	     
	    public void Signin(String name, String passwordd) throws InterruptedException
	     {
	        signinbutton.click();
	         Username.sendKeys(name);
	         Thread.sleep(1000);
	         Password.sendKeys(passwordd);
	         Thread.sleep(1000);
	         login.click();
	     }
	       public void goTo()
	         {
	            driver.get("https://mobileworld.banyanpro.com");
	    
	         }
	}


