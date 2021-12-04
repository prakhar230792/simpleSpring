package com.practice.app.controller;

import com.practice.app.service.BookSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookSearchController {

    @Autowired
    private BookSearchService bookSearchService;

    @GetMapping("/hello/{bookId}")
    public String hello(@PathVariable(name ="bookId") Integer bookId) {
        return bookSearchService.hello(bookId);
    }
}
