package ExceptionConcepts;

public class ExceptionHandling {
//	int a = 10;
//	static ExceptionHandling obj;
	
	public static void main(String[] args) {
		
//		uncaught exceptions
//		
//		int i =9/0;
//		System.out.println(i);
	
//	
//		caught exceptions
//		Thread.sleep(1000);
	
	
//		ExceptionHandling obj = new ExceptionHandling();
//		obj = null;
//		System.out.println(obj);
//		System.out.println(obj.a);
	
	
	try {
		
		int i = 9/0;
	}
	catch(ArithmeticException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
		System.out.println("exception on division");
	}
	
	System.out.println("abc");
	
	}
	
}
