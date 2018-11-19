package InheritanceConcept;

public class TestBanks {

	public static void main(String[] args) {

		HSBCBank hs = new HSBCBank();
		hs.carLoan();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		

//		dynamic polymorphism - inheriting child to parent
		UsBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		
		
		
	}

}
