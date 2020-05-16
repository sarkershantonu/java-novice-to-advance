package org.practice.proxy;

public class Application {
	public static void main(String[] args) {
		BalanceInformation myInformer = new StatementInformer();
		System.out.println("The account Balance is : "+myInformer.getBalance());
	}
}
