package org.practice.myobserver.observable;

import org.practice.myobserver.observer.MyObserver;

public interface MyObservable {
	void notifyAllOvservers();
	void notifyAllOvservers(Object arg);
	void attachAObserver(MyObserver myObserver);
	void detachAObserver(MyObserver myObserver);
	int countObservers();
	void setChange();
	void clearChange();
	boolean hasChange();
}
