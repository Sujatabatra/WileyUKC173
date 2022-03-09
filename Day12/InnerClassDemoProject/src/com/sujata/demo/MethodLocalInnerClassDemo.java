package com.sujata.demo;

class MyOuter{
	
	public void someMethod() {
		int i=0;
		class MyInner {
			int j;
			void show() {
				System.out.println("j"+j);
				System.out.println("i"+i);
			}
		}
//		System.out.println("j : "+j);
		MyInner obj=new MyInner();
		System.out.println(obj.j);
	}
}
public class MethodLocalInnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
