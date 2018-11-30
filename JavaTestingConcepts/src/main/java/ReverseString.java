
public class ReverseString {

	
	public static void main (String[] args) {
		
		String input = "StringReverse";
		
		char[] array1 = input.toCharArray();
		
		for ( int i = array1.length-1 ; i>=0 ; i-- ) {
			
			System.out.println(array1[i]);
		}
	}
}
