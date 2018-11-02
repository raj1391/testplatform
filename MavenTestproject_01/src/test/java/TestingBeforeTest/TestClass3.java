package TestingBeforeTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass3 {

	@BeforeTest
	public void beforeTest1() {
		
		System.out.println("before test class3");
	}

	@Test 
	public void test () {
		
		System.out.println("test method class3");
	}
}

