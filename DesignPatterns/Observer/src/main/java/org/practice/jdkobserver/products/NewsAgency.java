package org.practice.jdkobserver.products;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class NewsAgency extends Observable{
	private ArrayList<String> news = new ArrayList<String>(); 
	private ArrayList<Observer> observers = new ArrayList<Observer>(); 
	private boolean hasChanged = false; 
	@Override
	public void notifyObservers(){
		for(Observer a :  observers){
			a.update(null, " : New News ");
		}
		hasChanged = true;
	}
	@Override
	public void addObserver(Observer o){
		observers.add(o);
	}
	@Override
	public void deleteObserver(Observer o){
		observers.remove(o);
	}	
	public void addNews(String updatesNews) {
		news.add(updatesNews);
		hasChanged=true;		
	}
	public boolean hasChanged() {
		return hasChanged; 		
	}

}
