package org.practice.observer.products;

import org.practice.observer.services.MyObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractObservable implements MyObservable{
	protected List<MyObserver> observers = new ArrayList();
	protected boolean hasChanged = false;


	public void notifyAllOvservers(){
		for(int i=0; i<observers.size();i++){
			observers.get(i).update();
		}
	}
	public void notifyAllOvservers(Object arg){
	//Just another way to notify with arguments
		for(int i=0; i<observers.size();i++){
			observers.get(i).update(arg);
		}		
	}
	public void attachAObserver(MyObserver observer) {
		observers.add(observer);
	}
	public void detachAObserver(MyObserver observer) {
		observers.remove(observer);
	}
	public int countObservers(){
		return observers.size();		
	}
	public abstract void setChange();
	public abstract void clearChange();
	public boolean hasChange() {
		return hasChanged;
	}

}
