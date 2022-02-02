package com.n2s.SpringXMLConfig2;

public class Brand {
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	//toString - returns the value given to it in string format.
	public String toString() {
		return "Brand [name=" + name + ", price=" + price + "]";
	}
	
	public Brand(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	} 
	
	
	
}
