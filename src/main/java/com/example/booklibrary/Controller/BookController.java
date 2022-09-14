package com.example.booklibrary.Controller;


import com.example.booklibrary.Service.BookService;
import com.example.booklibrary.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
    @GetMapping("{id}")
    public Book getBook (@PathVariable String id) {
        return bookService.getBookById(id);
    }
}
