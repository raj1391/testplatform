package InheritanceConcept;

public class TestCar {

	public static void main(String[] args) {

		Car c1 = new Car();
		Car c2 = new BMW();
		
		
//		static polymorphism  compile time polymorphism
		
		BMW b1 = new BMW();
		
		System.out.println("BMW objects ");
		b1.start();
		b1.stop();
		b1.theftSafety();
		b1.refuel();
		
		
		
		System.out.println("*********************");
		System.out.println("car methods loaded  from car class");
//		dynamic polymorphism -- Run-time polymorphism
		
		c1.start();
		c1.stop();
		c1.refuel();
		
		
		System.out.println("**********************");
		System.out.println("BMW methods referenced from car class");
		
		c2.stop();
		c2.start();
		c2.refuel();
		c2.horn();
		
	
/*		c1.theftSafety() && c2.theftSafety() cannot be created since we cannot inherit the child class feature into the parent class 
		just by referencing to it 
		
		bmw will not allow theftsafety() to be used by automobile manufacturer since it was founded by bmw company
		
*/	
		}

}
