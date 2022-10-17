package com.contact.contactus;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

import com.contact.contactusPageobject.LandingPageSignUp;
	public class SignUp {



	       
	        @Test
	        (dataProvider="SignUp1")
	        public void SignUp1(String Firstname, String Lastname, String Email, String Password, String date, String Mobnum, String Shortbio) throws InterruptedException
	        {
	          System.setProperty("webdriver.chrome.driver","C:\\Users\\Pratiksha.singhe\\Downloads\\chromedriver_win32//chromedriver.exe");



	       
	        WebDriver driver=new ChromeDriver();  
	        LandingPageSignUp Siin = new LandingPageSignUp(driver);
	        Siin.goTo();
	        Siin.Signup(Firstname, Lastname, Email, Password, date, Mobnum, Shortbio);
	        Thread.sleep(2000);
	    }
	        
	    @DataProvider
	       public Object[][] SignUp1() {
	            Object[][] data = new Object[1][7];
	            
	            data[0][0]="Pratiksha";
	            data[0][1]="Singhe";
	            data[0][2]="Pratiksha@gmail.com";
	            data[0][3]="abc@123";
	            data[0][4]="09/09/2000";
	            data[0][5]="878946657";
	            data[0][6]="this is text";
	            return data;
	        
	    
	       
	    }
	}


