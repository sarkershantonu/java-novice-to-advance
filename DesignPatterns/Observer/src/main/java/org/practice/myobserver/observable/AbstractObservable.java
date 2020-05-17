package org.practice.myobserver.observable;

import org.practice.myobserver.observer.MyObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractObservable implements MyObservable{
	protected List<MyObserver> observers = new ArrayList();
	protected boolean hasChanged = false;


	public void notifyAllOvservers(){

		for(MyObserver observer : observers){
			observer.update(" : New News ");
		}

	}
	public void notifyAllOvservers(Object arg){
	//Just another way to notify with arguments
		for(MyObserver observer : observers){
			observer.update(arg);
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
