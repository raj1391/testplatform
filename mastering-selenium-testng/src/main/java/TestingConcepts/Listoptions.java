package TestingConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Listoptions {

	public static void main(String[] args) {
		

System.setProperty("webdriver.chrome.driver", "E:\\Download\\Chrome\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver d = new ChromeDriver(options);

		d.get("https://www.facebook.com");
		WebElement fb_day = d.findElement(By.id("day"));
		

	Select oSelect = new Select(d.findElement(By.id("day")));
	List <WebElement> elementCount = oSelect.getOptions();
	
	System.out.println(elementCount.size());
//	
//	for(int i=0;i<elementCount.size();i++){
//	    System.out.println(elementCount.get(i));
//	} 
		
		
	}
}
