package TestingBeforeTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {
	
	@BeforeTest
	public void beforeTestClass1() {
		
		System.out.println("beforetest class1");
	}
	
	@BeforeTest
	public void beforeTest2class1() {
		
		System.out.println("beforetest2 class1");
	}
	
	@Test 
	public void test1() {
		
		System.out.println("testing class1");
	}

}
