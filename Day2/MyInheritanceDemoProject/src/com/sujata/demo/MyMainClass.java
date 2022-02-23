package com.sujata.demo;

public class MyMainClass {

	public static void main(String[] args) {
		Student student=new Student();
		
		student.input(101, "AAAAA");
		student.displayStudent();
		
		System.out.println("=======================");
		
		Sports sports=new Sports();
		sports.input(222, "Anisha","Cricket");
		sports.displayStudentWithSportsDetails();

	}

}
