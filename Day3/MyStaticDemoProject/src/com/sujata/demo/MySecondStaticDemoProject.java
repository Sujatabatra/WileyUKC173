package com.sujata.demo;

class Base{
	
	static int x=10;
	public void show() {
		System.out.println("Hi I am show() method from Base");
	}
	
	static public void display() {
		System.out.println("Hi I am display() method from Base");
	}
}

class Derived extends Base{
	public void show() {
		System.out.println("Hi I am overridden show() method in Derived from Base");
	}
//	@Override
//	static public void display() {
//		System.out.println("Hi I am overridden display() method in Derived from Base");
//	}
}
public class MySecondStaticDemoProject {

	public static void main(String[] args) {
		Base.x=15;
		Base b=new Base();
		b.show();
		b.display();
		System.out.println(b.x);
		
		b=new Derived();
		b.x=24;
		b.show();
		b.display();
		System.out.println("x :"+Base.x);
		
		Base.display();
		Derived.display();

	}

}
