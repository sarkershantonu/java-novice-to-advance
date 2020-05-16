package org.practice.observer.services;

/***
 * this can be user in alternative to MyObserver interface
 */
public abstract class AbstractObserver {
	public abstract void update();
	public abstract void update(Object args);
}
