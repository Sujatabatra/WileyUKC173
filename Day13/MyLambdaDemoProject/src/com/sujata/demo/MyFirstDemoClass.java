package com.sujata.demo;

@FunctionalInterface
interface Greet{
	public void wish();
}
@FunctionalInterface
interface WishMorning{
	public void wish(String name);
}
@FunctionalInterface
interface Addition{
	public int sum(int number1,int number2);
}

interface Calculate{
	public int factorial(int n);
}
public class MyFirstDemoClass {

	public static void main(String[] args) {
		Greet greet=()-> System.out.println("Hi Suraiya!");
				
//		Greet greet=()-> System.out.println("Good Morning Everyone!");
				
		greet.wish();
			
//		WishMorning wishMorning=(String name)->System.out.println("Good Morning "+name);

//		WishMorning wishMorning=(name)->System.out.println("Good Morning "+name);
		
		WishMorning wishMorning=name->System.out.println("Good Morning "+name);
		wishMorning.wish("Shivam");
		
//		Addition addition=(number1,number2)->{return number1+number2;};
		
		Addition addition=(number1,number2)-> number1+number2;
		
		System.out.println(addition.sum(10, 20));
		
		Calculate fOb=n->{ int factorial=1;
		while(n>=1) {
			factorial*=n--;
		}
		return factorial;};
		
		System.out.println(fOb.factorial(4));
	}

}
