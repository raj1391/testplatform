package MethodOverloadingConcept;

/**
 * Hello world!
 *
 */
public class MethodOverload 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    
    MethodOverload obj = new MethodOverload();
    
    obj.sum();
    obj.sum(5);
    }
    
    
    public static void main (int a ) {
    	
    }
    
    public static void main (int a , int b ) {
    	
    }
    	
    public void sum () {
    	
    	System.out.println("met 1 ");
    	
    	
    }
    
    public void sum (int i) {
    	
    	System.out.println("meth2");
    	
    	
    }
    
    
}
