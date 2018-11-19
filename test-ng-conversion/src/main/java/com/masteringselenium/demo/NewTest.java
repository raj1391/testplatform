package com.masteringselenium.demo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class NewTest {
	WebDriver  driver;
	
	
//	adding testing branch 
	
 @BeforeMethod
//    @BeforeTest
    
  public void openBrowsers() {

			 System.setProperty("webdriver.chrome.driver","E:\\Download\\Chrome\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			  System.out.println("Instantiating driver");
			 System.out.println("Running main method"); 
			 			
	 
	  driver.get("http://www.google.com");
	     
  }
	  
@AfterMethod
	  
	  public void closeBrowser() {
	 
		  driver.quit();
		  System.out.println("Closing browser");
		  
	  }
	 

@Test
	  
	  public void test() {
		  
	 WebElement element = driver.findElement(By.name("q"));
	 element.sendKeys("Cheese!");
	 element.submit();
	 
		  System.out.println("Login succsesfull");
	  }


@Test

	public void test1() {
	
//	driver.findElement(By.id("u_0_2")).click();
//	  System.out.println("Login succsesfull ");

	System.out.println("method call success");
}
 
}