package org.practice.flyweight.bankAccounts;

public enum AccountType {
Current,Savings,Salary,student,employee,premium,fc,rfcd;
public static AccountType getARandomeType(){
	return values()[(int)(Math.random()*values().length)];
}
}
