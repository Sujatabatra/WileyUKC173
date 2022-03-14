package com.sujata.Chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharFileReadDemoClass {

	public static void main(String[] args)  {
		
		try (FileReader fileReader=new FileReader("CharDemo");){
			int ch;
			while((ch=fileReader.read())!=-1) {
				System.out.print((char)ch);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
