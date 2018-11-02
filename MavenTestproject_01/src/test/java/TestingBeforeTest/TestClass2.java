package TestingBeforeTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass2 {
	
	@BeforeTest
	public void beforetest() {
		
		System.out.println("beforetest class2");
	}

	@BeforeTest
	public void beforetest2 () {
		System.out.println("beforetest2 class2");
	}
	
	@Test
	public void test() {
		System.out.println("test method class2");
	}
}
