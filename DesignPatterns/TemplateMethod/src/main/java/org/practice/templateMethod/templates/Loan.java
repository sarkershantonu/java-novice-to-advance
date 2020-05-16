package org.practice.templateMethod.templates;

public abstract class Loan {
	public abstract void checkAllAccountStatement() ;
	public abstract void checkBankSolvency() ;
	public abstract void checkBusiness() ;
	public abstract void checkEmployment();
	public abstract void checkPeoperty() ;
	public final void provideLoan()//the template method
	{
		createBankAccount();		
		if(needCheckProperty()){
			checkPeoperty();
		}
		if(needCheckEmployment()){
			checkEmployment();
		}
		if(needCheckBusiness()){
			checkBusiness();		}
		if(needCheckBankSolvency()){
			checkBankSolvency();
		}
		if(needCheckAllAccountStatement()){
			checkAllAccountStatement();
		}		
		keepAllMonthlyInstallmentChecks();
		sendConfirmation();
	}
	public void sendConfirmation() {
		System.out.println("A loan has been sanctioned");
		
	}
	public void keepAllMonthlyInstallmentChecks() {
		System.out.println("Taking all signed checks for monthly installments");		
	}	
	public void createBankAccount(){
		System.out.println("An account has been created for the loan ");
	}
	//the hooks
	public boolean needCheckProperty(){return true;}
	public boolean needCheckBankSolvency(){return true;}
	public boolean needCheckAllAccountStatement(){return true;}
	public boolean needCheckEmployment(){return true;}
	public boolean needCheckBusiness(){return true;}
}
