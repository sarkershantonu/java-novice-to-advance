package org.practice.myobserver.observable;

import org.practice.myobserver.observer.MyObserver;

import java.util.ArrayList;
import java.util.Observer;

public class NewsAgency extends AbstractObservable{
	private ArrayList<String> news = new ArrayList<String>();
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private boolean hasChanged = false;
	public void addNews(String updatesNews) {
		news.add(updatesNews);
		hasChanged=true;		
	}


	public void setChange() {

	}

	public void clearChange() {

	}

}
