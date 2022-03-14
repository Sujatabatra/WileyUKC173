package com.sujata.objectio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectFileWriteDemoClass {

	public static void main(String[] args) {
		try(FileOutputStream fos=new FileOutputStream("PersonDetails");
				ObjectOutputStream oos=new ObjectOutputStream(fos);) {
			
						
			Person person=new Person(111, "AAAA", 30);
			oos.writeObject(person);
			System.out.println("File Created");
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
