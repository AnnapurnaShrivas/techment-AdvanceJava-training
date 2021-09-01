package com.test;


import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="library2000")
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	
	@OneToMany(mappedBy = "library",cascade = CascadeType.ALL)
	Set<Book> books;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	
	
	
	
	
}
