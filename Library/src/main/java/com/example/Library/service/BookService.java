package com.example.Library.service;


import com.example.Library.model.Book;
import com.example.Library.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookService {

    private BookRepo bookRepo;

    @Autowired
    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public void addBook(String authorBook, String nameBook) {
        Book book = new Book();
    }
    public Book getBook(String nameBook) {
        bookRepo.getNameBook(nameBook).orElseThrow(() ->new IllegalArgumentException("ni ma"));
        return null;
    }


}
