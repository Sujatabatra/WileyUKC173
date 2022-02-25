package com.sujata.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MyAutomaticResourseDeallocationDemoClass {

	public static void openFile(String fName) throws IOException{
		
		//JDK 1.7
		try (FileInputStream fis=new FileInputStream(fName)){
			
			System.out.println(fName+" File Opened");
		} 
		catch (FileNotFoundException e) {
			System.out.println("No File exist with name "+fName);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter File Name : ");
		String fileName=scanner.next();
		
			try {
				openFile(fileName);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
