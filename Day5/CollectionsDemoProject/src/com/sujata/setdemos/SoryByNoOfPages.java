package com.sujata.setdemos;

import java.util.Comparator;

public class SoryByNoOfPages implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		if(o1.getNoOfPages()>o2.getNoOfPages())
			return 1;
		else if(o1.getNoOfPages()<o2.getNoOfPages())
			return -1;
		return 0;
	}

	
}
