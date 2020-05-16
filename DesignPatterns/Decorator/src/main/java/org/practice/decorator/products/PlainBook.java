package org.practice.decorator.products;

public class PlainBook implements Book {
	private String title = "Title : Decoretor Pattern";
	private String auther=" Auther : Shantonu";
	private String description=title+auther+" , this is Simple Book.";
	private double price = 300.00;
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public PlainBook() {
	}

	public String getDescription() {
		System.out.println(description);
		return description;
	}

	public double getPrice() {
		System.out.println("Plain Book Costs : "+price);
		return price;
	}

}
