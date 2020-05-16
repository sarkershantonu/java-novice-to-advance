package org.practice.observer.products;

import org.practice.observer.services.MyObserver;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class NewsAgency extends AbstractObservable{
	private ArrayList<String> news = new ArrayList<String>();
	public void addNews(String updatesNews) {
		news.add(updatesNews);
		hasChanged=true;		
	}
	public boolean hasChanged() {
		return hasChanged; 		
	}

	public void attachAObserver(MyObserver myObserver) {

	}

	public void detachAObserver(MyObserver myObserver) {

	}

	public void setChange() {

	}

	public void clearChange() {

	}

	public boolean hasChange() {
		return hasChanged;
	}


}
