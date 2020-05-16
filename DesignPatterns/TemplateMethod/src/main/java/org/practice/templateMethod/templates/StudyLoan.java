package org.practice.templateMethod.templates;

public class StudyLoan extends Loan{
	public void checkBankSolvency() {
		System.out.println("Checking Bank Solvency for Student Loan");
	}	
	public void checkBusiness() {}	
	public void checkEmployment() {}	
	public void checkPeoperty() {}
	public void checkAllAccountStatement() {}
	public boolean needCheckProperty(){return false;}
	public boolean needCheckAllAccountStatement(){return false;}
	public boolean needCheckEmployment(){return false;}
	public boolean needCheckBusiness(){return false;}
}
