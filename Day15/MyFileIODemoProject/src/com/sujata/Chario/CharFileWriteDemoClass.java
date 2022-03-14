package com.sujata.Chario;

import java.io.FileWriter;
import java.io.IOException;

public class CharFileWriteDemoClass {

	public static void main(String[] args) {
		
		try(FileWriter fileWriter=new FileWriter("CharDemo");) {
			
			String str="Lili Vincze";
			
			fileWriter.write(str);
			System.out.println("File Created");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
