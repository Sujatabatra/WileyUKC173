package com.sujata.demo;

public class MainShape {

	public static void main(String[] args) {
		DrawShape ds1=new DrawShape(new Rectangle());
		ds1.showStats();
		
		ds1=new NewDrawShape(new Rectangle());
		ds1.showStats();
		

	}

}
