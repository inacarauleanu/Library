package com.example.demo;

public class Book {
    private Long id; //i use this field as an unique identifier for each book
    private String title; //the title of the book
    private String author; //the author

    public Book() {}

    public Book(Long id, String title, String author) //the constructor for the Book class
    {
        this.id = id;
        this.title = title;
        this.author = author;
    }
    //getters and setters for each attribute of the class
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
