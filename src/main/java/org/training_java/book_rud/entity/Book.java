package org.training_java.book_rud.entity;

import jakarta.persistence.*;
import org.training_java.book_rud.dto.request.BookRequest;


@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "author", nullable = false)
    private String author;
    @Column(name = "code",nullable = false)
    private String code;

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static Book from(BookRequest request) {
        Book book = new Book();
        book.setName(request.getName());
        book.setAuthor(request.getAuthor());
        book.setCode(request.getCode());
        return book;
    }
}



