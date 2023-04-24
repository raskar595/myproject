package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Admin;
import com.model.Book;
import com.model.User;
import com.service.AdminServiceImplement;
import com.service.BookServiceImplement;
import com.service.UserServiceImplement;

@RestController
public class AdminController {

	@Autowired
	AdminServiceImplement adminService;
	@Autowired
	UserServiceImplement userService;
	@Autowired
	BookServiceImplement bookService;
	
	@PostMapping("/admin")
	public Admin saveAdmin(@RequestBody Admin admin) {
		return adminService.saveAdmin(admin);
	}
	@PostMapping("/user")	
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);	
	}
	@PostMapping("/book")
	public Book saveBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}
	
	@PostMapping("/listbook")
	public List<Book> listBook(@RequestBody List<Book>book){
		return bookService.listBook(book);
	}
}










