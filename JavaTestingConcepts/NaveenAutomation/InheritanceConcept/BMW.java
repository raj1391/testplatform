package InheritanceConcept;

public class BMW extends Car{ //**has-a relationship
	
public void start () {
		
		System.out.println("BMW --car start ");
	}
	
	public void stop () {
		
		System.out.println("BMW --car stop");
	}
	
	public void refuel() {
		
		System.out.println("BMW-- car refuel");
	}
	
	public void theftSafety() {
		
		System.out.println("theft safety configured");
	}
	
	
}
