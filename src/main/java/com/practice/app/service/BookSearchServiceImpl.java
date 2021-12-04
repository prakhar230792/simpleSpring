package com.practice.app.service;

import org.springframework.stereotype.Service;

@Service
public class BookSearchServiceImpl implements BookSearchService {

    @Override
    public String hello(Integer bookId) {
        if (bookId == null) {
            return "not found";
        } else if (bookId == 1) {
            return "Book 1 found";
        } else {
            return "search manually";
        }
    }
}
