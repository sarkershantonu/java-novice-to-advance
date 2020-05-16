package org.practice.myobserver.observable;

import org.practice.myobserver.observer.MyObserver;

import java.util.ArrayList;

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
