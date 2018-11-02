package TestNGConceptsNaveen;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	@BeforeGroups
	public void security() {
		System.out.println("before security");
	}
	
	@AfterGroups
	public void tearDownSecurity() {
		System.out.println("closing security");
	}
	
	@BeforeSuite //1
	public void setup() {
		
		System.out.println("set browser system prorperties");
	}
	
	@BeforeTest //2
	public void launchBrowser() {
		
		System.out.println("launch browser");
	}
	
	@BeforeClass
	public void login() {
		System.out.println("login to app");
	}
	
	@BeforeMethod //4
	public void enterURL() {
		System.out.println("enter URL");
		
	}
	
	@Test //5
	public void getTitle() {
		
		System.out.println("validate google title");
	}
	
	@Test
	public void test2() {
		
		System.out.println("test2");
	}
	
	@Test
	
	public void test3 () {
		
		System.out.println("test3");
	}
	
	
	@AfterMethod //6
	public void logOut() {
		System.out.println("logout url");
	}
	
	@AfterClass //7
	public void closebrowser() {
		System.out.println("close browser");
	}
	
	@AfterTest //8
	public void deleteAllCookies() {
		System.out.println("deleting all cookies");
	}
	
	@AfterSuite //9
	public void generateReport() {
		System.out.println("generate all reports");
	}
}
