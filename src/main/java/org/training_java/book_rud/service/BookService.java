package org.training_java.book_rud.service;


import org.springframework.data.domain.Page;
import org.training_java.book_rud.dto.request.BookRequest;
import org.training_java.book_rud.dto.response.BookReponse;
import org.training_java.book_rud.entity.Book;
import org.training_java.book_rud.repository.BookRepository;

import java.util.List;

public interface BookService {
    BookRepository create(BookRequest request);

    void deleteById(long id);

    List<BookReponse> getAll();

    BookReponse getOneById(String id);

    BookReponse update(BookRequest request, String id);

    void deleteById(String id);


}




