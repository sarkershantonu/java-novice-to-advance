package org.practice.flyweight;


import org.practice.flyweight.bankAccounts.AccountMaker;
import org.practice.flyweight.bankAccounts.AccountType;

public class Application {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for(int i =1; i<=1000; i++){
			AccountMaker.getAccount(AccountType.getARandomeType()).printInformation();
			//new Account(AccountType.getARandomeType()).printInformation();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time Passed : "+(endTime-startTime)+" MS");
	}

}
