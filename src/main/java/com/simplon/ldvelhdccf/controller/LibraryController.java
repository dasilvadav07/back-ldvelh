package com.simplon.ldvelhdccf.controller;

import com.simplon.ldvelhdccf.dto.BookDto;
import com.simplon.ldvelhdccf.model.Book;
import com.simplon.ldvelhdccf.model.Library;
import com.simplon.ldvelhdccf.service.LibraryService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
@RequestMapping("/api/library")
public class LibraryController {

    @Autowired
    LibraryService libraryService;

    @PostMapping("/create")
    public Library postLibrary(Library library) {
        return libraryService.saveLibrary(library);
    }
}
