package com.contact.contactus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.contact.contactusPageobject.LandingPageContact;

public class ContactUs{
	
	    @Test(dataProvider="contactus")
	    public void contactus(String Username, String Email, String Phoneno, String Message ) throws InterruptedException {
	        
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\pratiksha.singhe\\Downloads\\chromedriver_win32//chromedriver.exe");
	        
	        WebDriver driver=new ChromeDriver();
	      
	        LandingPageContact landing  = new LandingPageContact(driver);
	        driver.get("https://mobileworld.banyanpro.com//");
	        landing.Contact(Username, Email, Phoneno, Message);
	        }  



	   @DataProvider
	    public Object[][] contactus()
	    {
	        Object[][]data=new Object[2][4];
	        
	        data[0][0]="Pratiksha";
	        data[0][1]="pratiksha@gmail.com";
	        data[0][2]="6364062096";
	        data[0][3]="this is message";
	        
	        data[1][0]="pratiksha";
	        data[1][1]="pratiksha@gmail.com";
	        data[1][2]="8798899900007789333";
	        data[1][3]="this is message";
	        return data;
	        
	    }

}
