package org.practice.abstractfactory.contractor;

import org.practice.abstractfactory.builders.HouseBuilder;
import org.practice.abstractfactory.builders.impl.OfficeBuilder;
import org.practice.abstractfactory.builders.impl.ResidentBuilder;
import org.practice.abstractfactory.builders.impl.ShopBuilder;
import org.practice.abstractfactory.products.House;
import org.practice.abstractfactory.products.Office;
import org.practice.abstractfactory.products.Resident;
import org.practice.abstractfactory.products.Shop;

//This class is responsible for creating all factory classes to build product objects
public class BuildingContractor extends Contractor{
	public BuildingContractor() {
		System.out.println("Building contractor created ");
	}
	public House makeHouse(String typeOfHouse) {
		House myHouse = null;
		HouseBuilder myBuilder = null;
		if(typeOfHouse.equals("Resident")){
			myBuilder = new ResidentBuilder();
			myHouse = new Resident(myBuilder);
			myHouse.setName("Resident House");
		} 
		else if(typeOfHouse.equals("Office")){
			myBuilder = new OfficeBuilder();
			myHouse = new Office(myBuilder);
			myHouse.setName("Office");
		} 
		else if(typeOfHouse.equals("Shop")){
			myBuilder = new ShopBuilder();
			myHouse = new Shop(myBuilder);
			myHouse.setName("Shop");
		}		
		return myHouse;
	}
}
