package com.masteringselenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","E:\\Download\\Chrome\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://www.gmail.com");
		 
		 WebElement ele=driver.findElement(By.className("identifierID"));
		 
		 ele.sendKeys("testing");
		 
		 Thread.sleep(5000);
		 driver.findElement(By.id("identifierId")).sendKeys("testing");
		 
	}

}
