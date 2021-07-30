package com.simplon.ldvelhdccf.service;

import com.simplon.ldvelhdccf.model.Book;
import com.simplon.ldvelhdccf.model.Chapter;
import com.simplon.ldvelhdccf.repository.BookRepository;
import com.simplon.ldvelhdccf.repository.ChapterRepository;
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

    public Iterable<Book> getAllBook() {
        return bookRepository.findAll();
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id).orElseThrow();
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
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
//
//    public Book bookDeleteChapter(int id, Chapter chapter) {
//        Optional<Book> bookOptional = bookRepository.findById(id);
//        Book book = null;
//        if (bookOptional.isPresent()) {
//            book = bookOptional.get();
//            var chapterIdInBook = book.getChapter().get(id).getId();
//            chapterRepository.deleteById(chapterIdInBook);
//            bookRepository.save(book);
//        }
//        return book;
//    }
}
