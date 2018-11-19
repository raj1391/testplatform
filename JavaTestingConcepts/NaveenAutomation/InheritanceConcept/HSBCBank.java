package InheritanceConcept;

public class HSBCBank implements UsBank, BrazilBank { //we are achieving multiple inheritance

	//**is - a relationship - in only in interface and class relation
	
	public void credit() {
		
		System.out.println("hsbc --credit");
		
	}
	
	public void debit() {
		
		System.out.println("hsbc -- debit");
	}

	public void transferMoney() {

		System.out.println("hsbc--money transfer");
	}
	
	public void mutualFunds() {

		System.out.println("hsbc --mutual funds");
	}
	
	public void educationLoan() {
		
		System.out.println("hsbc loan");
	}
	
	public void carLoan() {
		
		System.out.println("hsbc carloan");
	}

	
}
