package com.simplon.ldvelhdccf.service;

import com.simplon.ldvelhdccf.dto.BookDto;
import com.simplon.ldvelhdccf.model.Book;
import com.simplon.ldvelhdccf.model.BookInProgress;
import com.simplon.ldvelhdccf.model.Chapter;
import com.simplon.ldvelhdccf.repository.BookRepository;
import com.simplon.ldvelhdccf.repository.ChapterRepository;
import com.simplon.ldvelhdccf.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;
    @Autowired
    ChapterRepository chapterRepository;

    @Autowired
    UserRepository userRepository;

    public Iterable<Book> getAllBook() {
        return bookRepository.findAll();
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id).orElseThrow();
    }

    public Book saveBook(BookDto bookDto) {
        var user = userRepository.findById(bookDto.getUser_id());
        var book = BookDto.convertToBook(bookDto);
        bookRepository.save(book);
        user.get().getLibrary().getBooksCreated().add(new BookInProgress(book));
        userRepository.save(user.get());
        return book;
    }

    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }

    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    public Book bookAddChapter(int id, Chapter chapter) {
        Optional<Book> bookOptional = bookRepository.findById(id);
        Book book = null;
        if (bookOptional.isPresent()) {
            book = bookOptional.get();
            book.getChapter().add(chapter);
            chapterRepository.save(chapter);
            bookRepository.save(book);
        }
        return book;
    }

    public Book bookDeleteChapter(int id, int chapterId) {
        Optional<Book> bookOptional = bookRepository.findById(id);
        Optional<Chapter> chapterOptional = chapterRepository.findById(chapterId);
        Book book = null;
        Chapter chapter = null;
        if (bookOptional.isPresent() && chapterOptional.isPresent()) {
            book = bookOptional.get();
            chapter = chapterOptional.get();
            book.getChapter().remove(chapter);
            chapterRepository.delete(chapter);
            bookRepository.save(book);
        }
        return book;
    }
}
