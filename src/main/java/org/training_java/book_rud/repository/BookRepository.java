package org.training_java.book_rud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.training_java.book_rud.entity.Book;


public interface BookRepository extends JpaRepository<Book, String> {

    
}
