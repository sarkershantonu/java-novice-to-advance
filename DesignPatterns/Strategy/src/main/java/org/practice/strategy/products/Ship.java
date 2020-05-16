package org.practice.strategy.products;

import org.practice.strategy.strategies.StrategyBehaviour;

public class Ship {
	private String name; 
	public StrategyBehaviour work;
	public void getToWork(){
		work.carry();
	}
	public void setToWork(StrategyBehaviour aWork){
		work=aWork;
	}
	public Ship(String aName){
		name=aName;
		//System.out.println("A ship is created");
	}
	public String getName() {
		return name;
	}		
}
