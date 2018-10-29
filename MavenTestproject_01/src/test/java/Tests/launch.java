package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class launch {

	@Test
	
	public void firtTest () {
		
		System.out.println("test");
	}
	
	@BeforeMethod
	public void preTest() {
		
		System.out.println("before test");
	}
	
	@AfterMethod
	public void postTest() {
		
		System.out.println("post test");
	}
	
}
