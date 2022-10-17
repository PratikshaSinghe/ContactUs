package com.contact.contactus;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.contact.contactusPageobject.LandingPageContact;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class ContactUs {
  WebDriver driver;
  public void browserSelection(String browser) throws Exception{
      
      if(browser.equalsIgnoreCase("chrome")){
          WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
     }
             else if(browser.equalsIgnoreCase("edge")){
                 WebDriverManager.edgedriver().setup();
                 driver = new EdgeDriver();
             }
      
 }
     @Test(dataProvider="contactus")
     public void contactus(String Username, String Email, String Phoneno, String Message, String browser) throws Exception {
   
       browserSelection(browser);
       System.setProperty("Webdriver.chrome.driver","C:\\Users\\pratiksha.singhe\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
       driver = new ChromeDriver();
        LandingPageContact Contact = new LandingPageContact(driver);
        Contact.goTo();
   Contact.Contact(Username, Email, Phoneno, Message);
   }  

      @DataProvider
	    public Object[][] contactus()
	    {
	        Object[][]data=new Object[2][5];
	        
	        data[0][0]="Pratiksha";
	        data[0][1]="pratiksha@gmail.com";
	        data[0][2]="6364062096";
	        data[0][3]="this is message";
	        data[0][4]="chrome";
        
	        data[1][0]="pratiksha";
            data[1][1]="pratiksha@gmail.com";
	        data[1][2]="8798899900007789333";
	        data[1][3]="this is message";
	        data[1][4]="edge";
	        
        return data;
	        
	    }

}
