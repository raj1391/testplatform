package TestingConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Download\\Chrome\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver d = new ChromeDriver(options);

		d.get("https://www.facebook.com");
		WebElement fb_usrnm = d.findElement(By.id("email"));
		Thread.sleep(5000);
		System.out.println("setting username element");
		
		WebElement fb_passwd = d.findElement(By.id("pass"));
		Thread.sleep(5000);
		System.out.println("setting password element.....");
		WebElement fb_login = d.findElement(By.id("loginbutton"));
		System.out.println("setting login buttons elemnts.....");
		//*[@id="u_0_8"]
		
		//	password text box -- <input type="password" class="inputtext" name="pass" id="pass" tabindex="2" data-testid="royal_pass">
		
//	login button--	<input value="Log In" aria-label="Log In" tabindex="4" data-testid="royal_login_button" type="submit" id="u_0_8">
				
		fb_usrnm.sendKeys("raj.13.sekar@gmail.com");
		Thread.sleep(5000);
		System.out.println("parsing usernmae.....");
		
		fb_passwd.sendKeys("selenium!!!");
		System.out.println("parsing passwrd.....");
		
		Thread.sleep(10000);
		
		fb_login.click();
		System.out.println("parsing click option.....");
		
		Thread.sleep(5000);
//		WebElement fb_menu = d.findElement(By.id("userNavigationLabel"));
		WebElement fb_menu = d.findElement(By.xpath("//*[@id=\"userNavigationLabel\"]"));

		System.out.println("clicking on the dropdown...");
		fb_menu.click();
		
		System.out.println("settin menu button..... ");
		
		Thread.sleep(5000);
		
//		Select menu_oprn = new Select(fb_menu);
//		menu_oprn.selectByVisibleText("Log Out");
		
		d.findElement(By.partialLinkText("Log Out")).click();
		
		
		System.out.println("logged out succesfully.......");
		d.quit();
		System.out.println("completed testing");
	}
	
}