package com.example.Library.model;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Book {
    private final String titleBook;
    private final String authorBook;

    private final List<Book> bookList = new ArrayList<>();

    private final List<Book> borrowBook = new ArrayList<>();

    public Book(String nameBook, String authorBook) {
        this.titleBook = nameBook;
        this.authorBook = authorBook;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public String getAuthorBook() {
        return authorBook;
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
