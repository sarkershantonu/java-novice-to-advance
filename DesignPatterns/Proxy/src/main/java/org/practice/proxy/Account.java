package org.practice.proxy;

public class Account implements BalanceInformation, AccountInfo {
	private String name;
	private String address;
	private String mobileNumber;
	private double balance = 1000.00;
	private String lastAccessDate;	
	public String getLastAccessDate() {
		return lastAccessDate;
	}
	public void setLastAccessDate(String lastAccessDate) {
		this.lastAccessDate = lastAccessDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
}
