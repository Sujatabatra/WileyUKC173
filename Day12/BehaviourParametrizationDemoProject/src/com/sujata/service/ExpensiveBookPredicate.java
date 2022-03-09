package com.sujata.service;

import com.sujata.entity.Book;

public class ExpensiveBookPredicate implements BookPredicate {

	@Override
	public boolean test(Book book) {
		
		return book.getPrice()>6000;
	}

}
