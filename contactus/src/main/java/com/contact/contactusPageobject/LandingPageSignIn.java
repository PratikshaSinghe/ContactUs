package com.contact.contactusPageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



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
	     
	    public void Signin(String name, String password) throws InterruptedException
	     {
	        signinbutton.click();
	         Username.sendKeys(name);
	         Thread.sleep(1000);
	         Password.sendKeys(password);
	         Thread.sleep(1000);
	         login.click();
	         String ActualTitle = driver.getTitle();
	         String ExpectedTitle = "Mobile";
	         Assert.assertEquals(ActualTitle, ExpectedTitle);
	       
	         
	         driver.quit();

	     }
	       public void goTo()
	         {
	            driver.get("https://mobileworld.banyanpro.com");
	    
	         }
	}


