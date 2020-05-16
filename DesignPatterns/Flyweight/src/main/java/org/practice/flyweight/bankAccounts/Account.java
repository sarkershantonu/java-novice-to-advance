package org.practice.flyweight.bankAccounts;

public class Account {
	private String name="Shantonu Blog Example ";
	private AccountType type;
	public void setName(String name) {this.name = name;	}
	public String getName() {		return name;	}
	private static long objectCounter=1;
	public Account(AccountType aType){
		this.type = aType;
		System.out.println("Object number : "+objectCounter++);
	}	
	public void printInformation(){
		System.out.println("Account Name = "+this.name+", Account type = "+type.toString());
	}
}
