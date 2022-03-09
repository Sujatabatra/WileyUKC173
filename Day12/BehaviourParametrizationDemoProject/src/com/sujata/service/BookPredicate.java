package com.sujata.service;

import com.sujata.entity.Book;

public interface BookPredicate {

	boolean test(Book book);
}
