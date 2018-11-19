package TestNGConceptsNaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StaleElementExceptionConcept {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "E:\\Download\\Chrome\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver d = new ChromeDriver(options);
		
		d.manage().window().maximize();
		d.get("https://www.freecrm.com");
		
		WebElement wb1 = d.findElement(By.name("username"));

		wb1.sendKeys("raj");
	}
}
