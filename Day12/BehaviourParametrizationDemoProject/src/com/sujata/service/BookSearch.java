package com.sujata.service;

import java.util.ArrayList;
import java.util.List;

import com.sujata.dao.BookDao;
import com.sujata.entity.Book;

public class BookSearch {

	public List<Book> searchBooks(BookPredicate bookPredicate){
		List<Book> searchedBookList=new ArrayList<Book>();
		for(Book book:BookDao.getBookList()) {
			if(bookPredicate.test(book))
				searchedBookList.add(book);
		}
		return searchedBookList;
	}
	
	public List<Book> searchBooksWrittenBuAuthorA(){
		List<Book> searchedBookList=new ArrayList<Book>();
		for(Book book:BookDao.getBookList()) {
			if(book.getAuthorName().equals("Author A"))
				searchedBookList.add(book);
		}
		return searchedBookList;
	}
	
	public List<Book> searchExpensiveBooks(){
		List<Book> searchedBookList=new ArrayList<Book>();
		for(Book book:BookDao.getBookList()) {
			if(book.getPrice()>6000)
				searchedBookList.add(book);
		}
		return searchedBookList;
	}
	
	public List<Book> searchThickBooks(){
		List<Book> searchedBookList=new ArrayList<Book>();
		for(Book book:BookDao.getBookList()) {
			if(book.getNoOfPages()>1500)
				searchedBookList.add(book);
		}
		return searchedBookList;
	}
}
