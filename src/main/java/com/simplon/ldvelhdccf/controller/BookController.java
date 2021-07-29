package com.simplon.ldvelhdccf.controller;

import com.simplon.ldvelhdccf.model.Book;
import com.simplon.ldvelhdccf.service.BookService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Data
@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("")
    public Iterable<Book> listBook() {
        return bookService.getAllBook();
    }

    @GetMapping("/{id}")
    public Book book(@PathVariable int id) {
        return bookService.getBookById(id);
    }

    @PostMapping()
    public Book postBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }
}
