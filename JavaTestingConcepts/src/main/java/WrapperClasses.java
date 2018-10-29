
public class WrapperClasses {

	public static void main(String[] args) {

		
		String x = "100";
		
		
		System.out.println(x+100);
		System.out.println("printed string x+100");
//		Integer is wrapper class used to convert string to integer values

		int i = Integer.parseInt(x);
		System.out.println("parsing string to integer ");
		
		System.out.println(i+100);
		System.out.println("printed integer sum = i+100");
		
		System.out.println(x);
		System.out.println("printed  string x ");
		
//		converting string to double
		System.out.println();
		System.out.println("*********************************");
		
		String y = "22.33";
		
		System.out.println(y);
		System.out.println("printed string double");
		
		System.out.println(y+100);
		System.out.println("printed string y+100");
		
		double d = Double.parseDouble(y);
		System.out.println("parsing string to double ");
		
		System.out.println(d);
		System.out.println("printed double d");
		
		System.out.println(d+100);
		System.out.println("printed sum of double ");
		
		
	}

}
