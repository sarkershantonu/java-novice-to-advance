package org.practice.composite.components;

public class Book extends BookComponent{
	String name;
	String autherName;
	int publishedYear;
	public Book(String bookName, String author, int year){
		name=bookName;
		autherName=author;
		publishedYear=year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAutherName() {
		return autherName;
	}
	public void setAutherName(String name) {
		this.autherName = name;
	}
	public int getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}
	public void displayBookInfo(){
		System.out.println(getName()+" was published by "+getAutherName()+" in "+getPublishedYear());
	} 
}
