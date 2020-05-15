package org.practice.abstractfactory;

import org.practice.abstractfactory.contractor.BuildingContractor;
import org.practice.abstractfactory.contractor.Contractor;
import org.practice.abstractfactory.products.House;

public class Application {
	public static void main(String[] args) {
		Contractor myContractor = new BuildingContractor();
		House myHouse = myContractor.orderAhouse("Shop");
		System.out.println(myHouse+"\n");
		myHouse = myContractor.orderAhouse("Office");
		System.out.println(myHouse+"\n");
		myHouse = myContractor.orderAhouse("Resident");
		System.out.println(myHouse+"\n");
	}
}
