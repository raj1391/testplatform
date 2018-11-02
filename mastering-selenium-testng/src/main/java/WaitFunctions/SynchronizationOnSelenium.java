package WaitFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationOnSelenium {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","E:\\Download\\Chrome\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://www.facebook.com");
		 
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		 
//		 implicit wait is applied globally for all web elements
//		 dynamic in nature
//		 it can be changed anywhere and any time in the code
		 
		 WebElement firstName = driver.findElement(By.name("firstname"));
		 WebElement lastName = driver.findElement(By.name("lastname"));
		 WebElement forgot = driver.findElement(By.linkText("Forgotten account?"));
		 
//		 Explicit wait
//		 1. No explicit keyword or method 
//		 2. available with WebDriverWait with some ExpectedConditions
//		 3. specific to element
//		 4. dynamic in nature
//		 5. We should never use implicit wait and explicit wait together
		 
		sendKeys(driver, firstName, 20, "tommy");
		sendKeys(driver, lastName, 5, "tommy");
		clickOn(driver, forgot, 5);
		
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("passed");
	}
	
//	method to explicitly wait for element to be visible on the UI 
	
	public static void sendKeys(WebDriver driver, WebElement element , int timeout , String value) {
		
		new WebDriverWait(driver, timeout).	until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value); 
	}
	
//	copy of the above method with diff method name 
	
	public  static void explicitWaits(WebDriver driver, WebElement element , int timeout , String value) {
		
		new WebDriverWait(driver, timeout).	until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value); 
	}

	
//	explicitly waiting for element to be clickable on the UI 
	
	public static void clickOn(WebDriver driver , WebElement element , int timeout) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

}