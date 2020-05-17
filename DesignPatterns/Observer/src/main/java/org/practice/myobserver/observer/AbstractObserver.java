package org.practice.myobserver.observer;

/***
 * this can be user in alternative to MyObserver interface
 */
public abstract class AbstractObserver {
	public abstract void update();
	public  void update(Object args){
		String data = (String)args;
		System.out.println("I have notified : "+data);
	}
}
