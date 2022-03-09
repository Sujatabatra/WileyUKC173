package com.sujata.demo;

import com.sujata.entity.Book;
import com.sujata.service.BookPredicate;
import com.sujata.service.BookSearch;
import com.sujata.service.ThickBookPredicate;

public class BookClient {

	public static void main(String[] args) {
		BookSearch bookSearch=new BookSearch();
		
		System.out.println(bookSearch.searchBooksWrittenBuAuthorA());
		
		System.out.println(bookSearch.searchBooks(new ThickBookPredicate()));
		
		System.out.println("List of Expensive Books");
		System.out.println(bookSearch.searchBooks(new BookPredicate() {
			@Override
			public boolean test(Book book) {
				return book.getPrice()>6000;
			}
		}));

	}

}
