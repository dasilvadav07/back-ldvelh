package com.simplon.ldvelhdccf.service;

import com.simplon.ldvelhdccf.model.Book;
import com.simplon.ldvelhdccf.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public Iterable<Book> getAllBook(){
        return bookRepository.findAll();
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id).orElseThrow();
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
}
