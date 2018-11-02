package TestingConcepts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NavigateOptions {

	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Download\\Chrome\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.navigate().to("https://google.com");
		System.out.println("navigate to google");
		
	}
	
//	@Test(priority=1)
	public void BrowserOpenFacebook() {

		driver.navigate().to("https://facebook.com");
		System.out.println("mved to facebook");
	}
	
//	@Test(priority=2)
	public void BrowserOpenQuora() throws MalformedURLException {
	

		URL quora = new URL("https://quora.com");
		
		driver.navigate().to(quora);
	
	}
	
	
//	@Test(priority=3)
	public void BrowserBack() {
		
		driver.navigate().back();
		System.out.println("navigating back");
		
		driver.navigate().forward();
		
		System.out.println("navigating forward");
		
		driver.navigate().refresh();
		System.out.println("refreshing webpage");
		
	}

	@BeforeClass
	public void BrowserManage() {
		
		driver.manage().window().maximize();
	}
}
