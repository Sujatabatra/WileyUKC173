package com.sujata.demo;

public class Dish {
	
	private String dishName;
	private boolean isVegetarian;
	private int calorie;
	private int price;
	
	public Dish() {
		
	}
	
	public Dish(String dishName, boolean isVegetarian, int calorie, int price) {
		super();
		this.dishName = dishName;
		this.isVegetarian = isVegetarian;
		this.calorie = calorie;
		this.price = price;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public boolean isVegetarian() {
		return isVegetarian;
	}
	public void setVegetarian(boolean isVegetarian) {
		this.isVegetarian = isVegetarian;
	}
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Dish [dishName=" + dishName + ", isVegetarian=" + isVegetarian + ", calorie=" + calorie + ", price="
				+ price + "]";
	}
	

}
