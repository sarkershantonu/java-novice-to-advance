package org.practice.proxy;

public class StatementInformer implements BalanceInformation {
	BalanceInformation myAcccount = null;
	public StatementInformer() {
	}
	public StatementInformer(BalanceInformation account) {
		myAcccount=account;
	}
	public double getBalance() {
		if(myAcccount==null){
			myAcccount = new Account();
		}		
		return myAcccount.getBalance();
	}
	public String lastAccesDate()
	{
		Account aRealaccount = new Account();
		return aRealaccount.getLastAccessDate(); 
	}
}
