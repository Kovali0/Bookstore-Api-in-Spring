package com.example.demo;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "books")
public class Book {
    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;
    
    @Column(name = "author")
    private String author;

    public Long getId()
    {
    	return id;
    }
    
    public void setId(Long id)
    {
    	this.id = id;
    }
    
    public String getName()
    {
    	return name;
    }
    
    public void setName(String name)
    {
    	this.name = name;
    }
    
    public String getAuthor()
    {
    	return author;
    }
    
    public void setAuthor(String author)
    {
    	this.author = author;
    }
}
