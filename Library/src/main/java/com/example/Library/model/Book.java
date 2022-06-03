package com.example.Library.model;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Book {
    private final String title;
    private final String lastName;

    private final List<Book> bookList = new ArrayList<>();

    private final List<Book> borrowBook = new ArrayList<>();

    public Book() {
        this.title = title;
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public String getLastName() {
        return lastName;
    }

    public void addBook(Book book) {this.bookList.add(book);}

    public class BookService {

    }

    public class BookRepo {
    }

    public List<Book> getBookList(){return bookList;}

    public List<Book> getBorrowBook() {
        return borrowBook;
    }

    public void addBookToBorrowedBook(Book book) {
        this.borrowBook.add(book);
    }

}
