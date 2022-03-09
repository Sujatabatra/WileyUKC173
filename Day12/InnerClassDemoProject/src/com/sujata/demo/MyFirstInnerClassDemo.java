package com.sujata.demo;

class Outer{
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	class Inner{
		private int j;

		public int getJ() {
			return j;
		}

		public void setJ(int j) {
			this.j = j;
		}
		public void display() {
			System.out.println("j : "+j);
			System.out.println("i : "+i);
		}	
	}
	
	public void show() {
//		System.out.println("j : "+j);
		System.out.println("i : "+i);
	}
	
}
public class MyFirstInnerClassDemo {

	public static void main(String[] args) {
		Outer outer=new Outer();
		Outer.Inner inner=outer.new Inner();

	}

}
