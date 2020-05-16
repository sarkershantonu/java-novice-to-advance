package org.practice.templateMethod.templates;

public class ConsumerLoan extends Loan{
	public void checkAllAccountStatement() {
		System.out.println("Checking all bank account statement for Consumer Loan");		
	}
	public void checkBusiness() {
		System.out.println("Checking Business for Consumer Loan");
	}
	public void checkEmployment() {
		System.out.println("Checking Employment for Consumer Loan");
	}
	public void checkPeoperty() {}
	public void checkBankSolvency() {	}
	public boolean needCheckProperty(){return false;}
	public boolean needCheckBankSolvency(){return false;}
}
