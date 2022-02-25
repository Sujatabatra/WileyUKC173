package com.sujata.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CheckedException {

	public static void openFile(String fName) throws FileNotFoundException{
		FileInputStream fis=null;
//		try {
			fis=new FileInputStream(fName);
			System.out.println(fName+" File Opened");
//		} 
//		catch (FileNotFoundException e) {
//			System.out.println("No File exist with name "+fName);
//		}
//		finally {
//			try {
//				fis.close();
//			} 
//			catch (IOException e) {	
//				e.printStackTrace();
//			}
//			catch(NullPointerException ex) {
//				
//			}
//		}
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter File Name : ");
		String fileName=scanner.next();
		try {
			openFile(fileName);
		} catch (FileNotFoundException e) {
			System.out.println("You entered Incorrect file name");
		}
	}

}
