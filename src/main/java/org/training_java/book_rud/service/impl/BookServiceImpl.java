package org.training_java.book_rud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.training_java.book_rud.dto.request.BookRequest;
import org.training_java.book_rud.dto.response.BookReponse;
import org.training_java.book_rud.entity.Book;
import org.training_java.book_rud.repository.BookRepository;
import org.training_java.book_rud.service.BookService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
 public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public BookRepository create(BookRequest request) {

        Book book = Book.from(request);
        book = bookRepository.save(book);
        BookReponse response = new BookReponse();
        response.setName(book.getName());
        response.setAuthor(book.getAuthor());
        response.setCode(book.getCode());

        return bookRepository;

    }


    @Override
    public List<BookReponse> getAll() {
        List<Book> list = bookRepository.findAll();
        List<BookReponse> response = new ArrayList<>();
        for (Book book : list) {
            BookReponse bookResponse = new BookReponse();
            bookResponse.setId(book.getId());
            bookResponse.setName(book.getName());
            bookResponse.setAuthor(book.getAuthor());
            bookResponse.setCode(book.getCode());

            response.add(bookResponse);
        }
        return response;
    }

    @Override
    public BookReponse update(BookRequest request, String id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (!optionalBook.isPresent()) {
            throw new RuntimeException();
        }
        Book book = optionalBook.get();
        book.setName(request.getName());
        book.setAuthor(request.getAuthor());
        book.setCode(request.getCode());
       BookReponse response = new BookReponse();
        response.setId(book.getId());
        response.setName(book.getName());
        response.setAuthor(book.getAuthor());
        response.setCode(book.getCode());
        return response;
    }

    @Override
    public void deleteById(String id) {
        bookRepository.deleteById(id);

    }

    @Override
    public String getOneById() {

        Optional<Book> book = bookRepository.findById(getOneById());
        BookReponse response = new BookReponse();
        response.setId(book.get().getId());
        response.setName(book.get().getName());
        response.setAuthor(book.get().getAuthor());
        response.setCode(book.get().getCode());
       return getOneById();

    }



}