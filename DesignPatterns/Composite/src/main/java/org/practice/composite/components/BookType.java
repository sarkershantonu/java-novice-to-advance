package org.practice.composite.components;

import org.practice.composite.components.BookComponent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookType extends BookComponent {
	List books = new ArrayList();
	String typeName; 
	String typeDescription;	
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getTypeDescription() {
		return typeDescription;
	}
	public void setTypeDescription(String description) {
		this.typeDescription = description;
	}
	public BookType(String name, String des){
		typeName=name;
		typeDescription=des;
	}
	public void add(BookComponent aComponent) {
		books.add(aComponent);		
	}
	public void delete(BookComponent aComponent) {
		books.remove(aComponent);		
	}
	public BookComponent getComponent(int index){
		return (BookComponent)books.get(index);
	}
	public void displayBookInfo(){
		System.out.println(getTypeName()+" "+getTypeDescription());
		Iterator i = books.iterator();
		while(i.hasNext()){
			((BookComponent)i.next()).displayBookInfo();
		}		
	}
}
