package com.example.booklibrary.Service;

import com.example.booklibrary.model.Book;
import com.example.booklibrary.repository.BookDB;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {


    @Test
    void getAllBooks() {
        BookDB bookDBTest = mock(BookDB.class);
        BookService bookServiceTest = new BookService(bookDBTest);

        //GIVEN
        when(bookServiceTest.getAllBooks()).thenReturn(new ArrayList<>(List.of(new Book("Java fuer Dummies", "Michael Jackson", "1"))));

        //WHEN
        List<Book> actual = bookServiceTest.getAllBooks();
        //THEN
        List<Book> expected = new ArrayList<>(List.of(new Book("Java fuer Dummies", "Michael Jackson", "1")));

        assertEquals(expected,actual);

    }

    @Test
    void getBookById() {
        BookDB bookDBTest = mock(BookDB.class);
        BookService bookServiceTest = new BookService(bookDBTest);
        String id = "1";
        //GIVEN
        when(bookServiceTest.getBookById(id)).thenReturn(new Book("Java fuer Dummies", "Michael Jackson", "1"));
        //WHEN
        Book actual = bookServiceTest.getBookById(id);
        //THEN
        Book expected = new Book("Java fuer Dummies", "Michael Jackson", "1");
        assertEquals(expected, actual);
    }
}