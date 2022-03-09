package com.sujata.dao;

import java.util.ArrayList;
import java.util.List;

import com.sujata.entity.Book;

public class BookDao {

	static private List<Book> bookList=new ArrayList<Book>();
	
	static{
		bookList.add(new Book(1, "Book1", "Author A", 1000, 2500));
		bookList.add(new Book(2, "Book2", "Author B", 1200, 12500));
		bookList.add(new Book(3, "Book3", "Author A", 1600, 4500));
		bookList.add(new Book(4, "Book4", "Author C", 800, 5200));
		bookList.add(new Book(5, "Book5", "Author A", 2000, 6700));
	}

	public static List<Book> getBookList() {
		return bookList;
	}

	public static void setBookList(List<Book> bookList) {
		BookDao.bookList = bookList;
	}
	
	
}
