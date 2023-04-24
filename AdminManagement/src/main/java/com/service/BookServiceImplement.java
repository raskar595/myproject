package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BookRepository;
import com.model.Book;

@Service
public class BookServiceImplement implements BookService{

	@Autowired
	BookRepository bookRepo;

	public Book saveBook(Book book) {
		return bookRepo.save(book);
	}

	public List<Book> listBook(List<Book> book) {
		return bookRepo.saveAll(book);
	}
}
