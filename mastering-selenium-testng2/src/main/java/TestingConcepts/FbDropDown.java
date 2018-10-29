package TestingConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FbDropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "E:\\Download\\Chrome\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver d = new ChromeDriver(options);

		d.get("https://www.facebook.com");
	
		WebElement fb_day = d.findElement(By.id("day"));
		WebElement fb_month = d.findElement(By.id("month"));
		WebElement fb_year = d.findElement(By.id("year"));
		
		Select day_sel = new Select(fb_day);
		Select month_sel = new Select(fb_month);
		Select year_sel = new Select(fb_year);

		day_sel.selectByIndex(4);
		Thread.sleep(5000);
		System.out.println("day selected .....");
		
		Thread.sleep(5000);
		month_sel.selectByValue("5");
		
		Thread.sleep(5000);
		System.out.println("month selected .....");
		Thread.sleep(5000);
		year_sel.selectByVisibleText("2001");
		Thread.sleep(5000);
		System.out.println("year selcetd ....");
		
		System.out.println("pass...	");
	}

}
