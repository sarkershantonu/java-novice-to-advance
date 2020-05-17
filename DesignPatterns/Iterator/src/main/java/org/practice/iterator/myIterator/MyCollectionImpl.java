package org.practice.iterator.myIterator;


public class MyCollectionImpl implements MyCollection,MyIterator {
	private String[] bookNames = {"Design Pattern", "OOAD", "JAVA","C#"};
	private int iteratorPosition=0;	
	public MyIterator createIterator() {
		return new MyCollectionImpl();
	}

	public boolean hasNext() {
		if(iteratorPosition<bookNames.length){
			return true;
		}else
			return false;
	}

	public Object next()
	{
		if(this.hasNext()){
			return bookNames[iteratorPosition++];
		}
		else
			return null;
	}
}
