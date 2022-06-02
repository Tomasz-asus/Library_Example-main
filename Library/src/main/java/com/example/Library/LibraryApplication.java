package com.example.Library;

import com.example.Library.model.Book;
import com.example.Library.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryApplication {


	@Autowired
	private Customer.CustomerRepo customerRepo;

	@Autowired
	private Customer.CustomerService customerService;

	@Autowired
	private Book.BookService bookService;

	@Autowired
	private Book.BookRepo bookRepo;

	@Autowired
	private LibraryManager libraryManager;


	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

}
