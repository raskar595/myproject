package com.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int uid;
	private String uname;
	
	//@OneToMany(cascade=CascadeType.ALL,mappedBy = "Book")
	@OneToOne
	private Book book;

	public User() {
		super();
	}

	public User(int uid, String uname, Book book) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.book = book;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", book=" + book + "]";
	}
	
	

}
