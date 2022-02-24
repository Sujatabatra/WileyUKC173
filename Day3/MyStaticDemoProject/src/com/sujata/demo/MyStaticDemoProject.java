package com.sujata.demo;

public class MyStaticDemoProject {

	private int x;
	static private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public static int getY() {
		return y;
	}
	public static void setY(int y) {
		MyStaticDemoProject.y = y;
	}
	
	/*
	 * from static methods we can call only static members
	 */
	public static void show() {
		System.out.println("y : "+y);
//		System.out.println("x : "+x);
	}
	
	public void display() {
		System.out.println("y : "+y);
		System.out.println("x : "+x);
	}
}
