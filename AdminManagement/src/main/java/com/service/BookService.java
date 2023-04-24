package com.service;

import java.util.List;

import com.model.Book;

public interface BookService {
	
	Book saveBook(Book book);
	List<Book> listBook(List<Book>book);

}
