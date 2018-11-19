package ExceptionConcepts;

public class ArithmeticExceptionExample {
		
	public static void main(String[] args) {
		
		try {
			
			int a=30; int b = 0;
			int c=a/b;
			System.out.println("Result is " +c);
		}
		
		catch (ArithmeticException e){
			
			System.out.println("cant divide number");
		}
	}

}
