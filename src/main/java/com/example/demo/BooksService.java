package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

public interface BooksService {

    List<Book> findAll();

    Book findById(Long companyId);


}
