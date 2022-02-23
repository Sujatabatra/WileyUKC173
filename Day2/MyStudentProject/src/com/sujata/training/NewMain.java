package com.sujata.training;

import com.sujata.demo.Student;

public class NewMain {

	public static void main(String[] args) {
		Student student=new Student();
		student.input(111, "XYZ");
		student.displayStudent();
		
		System.out.println("==================");
		
		Marks marks=new Marks();
		marks.input(222, "ABC", 78, 89, 67);
		marks.displayStudentWithMarks();
		
		System.out.println("===================");
		
		Grade grade=new Grade();
		grade.input(123, "MNO", 66, 90, 88);
		grade.displayAllDetails();

	}

}
