package com.simplon.ldvelhdccf.controller;

import com.simplon.ldvelhdccf.dto.BookDto;
import com.simplon.ldvelhdccf.model.Book;
import com.simplon.ldvelhdccf.model.Chapter;
import com.simplon.ldvelhdccf.service.BookService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PutMapping("/{id}/update")
    public Book updateBook(@PathVariable int id, @RequestBody Book book) {
        return bookService.updateBook(book);
    }

    //    @PostMapping("/create")
//    public Book postBook(@RequestBody BookDto bookDto) {
//        return bookService.saveBook(bookDto);
//    }
    @PostMapping("/create")
    public Book postBook(@RequestBody Book book) {
        return bookService.save(book);
    }

    @DeleteMapping("/{id}")
    public void removeBook(@PathVariable int id) {
        bookService.deleteBook(id);
    }

    @GetMapping("/{id}/chapter")
    public List<Chapter> getChapters(@PathVariable int id) {
        return bookService.getBookById(id).getChapter();
    }

    @PostMapping("/{id}/chapter")
    public Book postChapterInBook(@PathVariable int id, @RequestBody Chapter chapter) {
        return bookService.bookAddChapter(id, chapter);
    }

    @DeleteMapping("/{id}/chapter/{chapterId}")
    public Book removeChapter(@PathVariable("id") int id, @PathVariable("chapterId") int chapterId) {
        return bookService.bookDeleteChapter(id, chapterId);
    }

}
