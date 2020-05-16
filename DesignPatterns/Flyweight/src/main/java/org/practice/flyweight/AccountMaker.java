package org.practice.flyweight;

import java.util.HashMap;

public class AccountMaker {
	private static final HashMap<AccountType, Account> myAccounts = new  HashMap<AccountType, Account>();
	public static Account getAccount(AccountType aType){
		Account myAccount;
		myAccount = (Account)myAccounts.get(aType);		
		if(myAccount==null){
			myAccount = new Account(aType);
			myAccounts.put(aType, myAccount);
			System.out.println("Object Added in hash"+myAccounts.size());
		}
		//myAccount = new Account(aType);
		//myAccounts.put(aType, myAccount);
		return myAccount;
	}
}
