package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksManager implements BooksService {

    @Autowired
    BooksRepository booksRepository;

    @Override
    public List<Book> findAll() {
        return booksRepository.findAll();
    }

    @Override
    public Book findById(Long bookid) {
        return booksRepository.findById(bookid).get();
    }



}
