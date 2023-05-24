package org.training_java.book_rud.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.training_java.book_rud.dto.request.BookRequest;
import org.training_java.book_rud.dto.response.BookReponse;
import org.training_java.book_rud.entity.Book;
import org.training_java.book_rud.repository.BookRepository;
import org.training_java.book_rud.service.BookService;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public BookRepository create(BookRequest request) {
        return null;
    }

    @Override
    public List<BookReponse> getAll() {
        return null;
    }

    @Override
    public BookReponse getOneById(String id) {
        return null;
    }

    @Override
    public BookReponse update(BookRequest request, String id) {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }



}
