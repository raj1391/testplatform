package InheritanceConcept;

public interface UsBank {

	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
//	only method declaration
//	no method body - method prototype
//	we can declare variables but vars are static by nature
//	no static methods in interface
//	no main methods
//	interfaces are abstract - we cannot create objects
	
}