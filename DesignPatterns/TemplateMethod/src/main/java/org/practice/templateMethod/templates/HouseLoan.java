package org.practice.templateMethod.templates;

public class HouseLoan extends Loan{	
	public void checkBankSolvency() {
		System.out.println("Checking Bank Solvency for house Loan");		
	}
	public void checkPeoperty() {
		System.out.println("Checking Property for house Loan");
	}
	public void checkAllAccountStatement(){}
	public void checkBusiness() {}
	public void checkEmployment() {}
	public boolean needCheckEmployment(){return false;}
	public boolean needCheckBusiness(){return false;}
	public boolean needCheckAllAccountStatement(){return false;}
}
