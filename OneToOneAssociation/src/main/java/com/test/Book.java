package com.test;

import javax.persistence.*;

@Entity
@Table(name="book2000")
public class Book {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int bookId;
	String bookName;
	String author;
	
	
	
	//unidirectional Assosication
	@ManyToOne
	@JoinColumn(name="libraryid")   // it is use to make forein key coloum
	Library library;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Library getLibrary() {
		return library;
	}
	public void setLibrary(Library library) {
		this.library = library;
	}
	
	
	
	
}
