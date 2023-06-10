package org.training_java.book_rud.service;


import org.training_java.book_rud.dto.request.BookRequest;
import org.training_java.book_rud.dto.response.BookReponse;
import org.training_java.book_rud.repository.BookRepository;

import java.util.List;

public interface BookService {
    BookRepository create(BookRequest request);


    String getOneById();

    BookReponse update(BookRequest request, String id);

    void deleteById(String id);


}




