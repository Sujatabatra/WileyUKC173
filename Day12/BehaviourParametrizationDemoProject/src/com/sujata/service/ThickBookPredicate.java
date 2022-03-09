package com.sujata.service;

import com.sujata.entity.Book;

public class ThickBookPredicate implements BookPredicate {

	@Override
	public boolean test(Book book) {
		return book.getNoOfPages()>1500;
	}

}
