package com.sujata.demo;

@FunctionalInterface
interface Shape {
	int area();
}

@FunctionalInterface
interface ShapeA {
	int area(int value);
}

// create two lambda's for creating area for rectangle and circle
public class MySecondDemo {

	public static void main(String[] args) {
		
		Shape rect=()-> 3*4;
		
		Shape circle=()->(int)(3.14*4*4);

		ShapeA square=n->n*n;
		ShapeA cir=(n)->(int)(3.14*n*n);
	}

}
