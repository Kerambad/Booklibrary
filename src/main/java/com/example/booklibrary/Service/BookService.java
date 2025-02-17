package com.example.booklibrary.Service;

import com.example.booklibrary.model.Book;
import com.example.booklibrary.repository.BookDB;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private BookDB bookDB;

    public BookService(BookDB bookDB) {
        this.bookDB = bookDB;
    }

    public List<Book> getAllBooks() {
        return bookDB.getAllBooks();
    }
    public Book getBookById (String id) {
        return bookDB.getBookById(id);
    }
}
