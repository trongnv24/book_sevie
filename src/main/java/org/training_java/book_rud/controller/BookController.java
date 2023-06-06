package org.training_java.book_rud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.training_java.book_rud.dto.request.BookRequest;
import org.training_java.book_rud.dto.response.BookReponse;
import org.training_java.book_rud.service.BookService;


@RestController

        @RequestMapping("/api/v1/books")

        public class BookController {
            @Autowired
            private BookService bookService;
            @PostMapping

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public String getOneById(@PathVariable("id") String id) {
        return bookService.getOneById();
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public BookReponse update(@RequestBody BookRequest request, @PathVariable("id") String id) {
        return bookService.update(request, String.valueOf(id));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") String id) {
        bookService.deleteById(String.valueOf(id));
    }


}
