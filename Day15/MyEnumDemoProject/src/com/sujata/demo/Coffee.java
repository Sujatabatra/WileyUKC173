package com.sujata.demo;

public enum Coffee {
	
	MOCHA(150,"LocationA",25),AMARICANO(120,"LocationA",30),LATTE(175,"LocationB",28);
	
	private Coffee(int price, String location,int quantity) {
		this.price = price;
		this.quantity = quantity;
		this.location = location;
	}
	private int price,quantity;
	private String location;
	public int getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public String getLocation() {
		return location;
	}
	
	
}
