package org.practice.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	List<Memento> mementoes = new ArrayList();
	public void add(Memento aMemento){
		mementoes.add(aMemento);
		System.out.println("One Item added, so no item count : "+mementoes.size());
	}
	public Memento getMemento(int index) {
		return mementoes.get(index);		
	}
}
