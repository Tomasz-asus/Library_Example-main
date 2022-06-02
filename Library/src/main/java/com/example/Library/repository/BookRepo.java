package com.example.Library.repository;


import com.example.Library.model.Book;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class BookRepo {

    private static final List<Book> bookList = new ArrayList<>();

    public Optional<Book> getNameBook(String nameBook){
        return bookList.stream()
                .filter(book ->book.getTitleBook().equals(nameBook))
                .findFirst();
    }

    public static void addBook(String nameBook, String authorBook) {
        bookList.add(new Book(nameBook, authorBook));
    }

    public List<Book> getBookList() {
        return bookList;
    }
}
