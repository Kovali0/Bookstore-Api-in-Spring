package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bookstore")
public class BooksController {

    @Autowired
    BooksService booksService;

    @GetMapping("/books")
    public List<Book> findAll() {
        return booksService.findAll();
    }

    @GetMapping("/books/{bookId}")
    public Book findById(@PathVariable Long bookId) {
        return booksService.findById(bookId);
    }

}
