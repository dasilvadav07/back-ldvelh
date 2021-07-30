package com.simplon.ldvelhdccf.service;

import com.simplon.ldvelhdccf.dto.BookDto;
import com.simplon.ldvelhdccf.model.Book;
import com.simplon.ldvelhdccf.repository.BookRepository;
import com.simplon.ldvelhdccf.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    UserRepository userRepository;

    public Iterable<Book> getAllBook(){
        return bookRepository.findAll();
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id).orElseThrow();
    }

    public Book saveBook(BookDto bookDto) {
        var user = userRepository.findById(bookDto.getUser_id());
        var book = BookDto.convertToBook(bookDto);
        bookRepository.save(book);
        user.get().getBooks().add(book);
        userRepository.save(user.get());
        return book;
    }

    public void deleteBook(int id) {  bookRepository.deleteById(id); }

    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }
}
