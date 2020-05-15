package org.practice.abstractfactory.products;

import org.practice.abstractfactory.components.Door;
import org.practice.abstractfactory.components.Furniture;
import org.practice.abstractfactory.components.Toilet;
import org.practice.abstractfactory.components.Window;

public abstract class House {
	private String name;
	public String getName(){return name;}
	public void setName(String newName){name=newName;}	
	Door aDoor;
	Window aWindow;
	Furniture furniture;
	Toilet aToilet;
	public abstract void makehouse();	
	public void displayName(){
		System.out.println(getName()+" is the Name of the house");
	}
	public String toString(){
		String info= "The "+name+" has a door which is "+aDoor+", a window which is "+aWindow+
				" , a toilet which has "+aToilet+" and "+furniture;
		return info;
	}
}
