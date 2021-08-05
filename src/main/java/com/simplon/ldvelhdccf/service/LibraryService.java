package com.simplon.ldvelhdccf.service;

import com.simplon.ldvelhdccf.model.Chapter;
import com.simplon.ldvelhdccf.model.Library;
import com.simplon.ldvelhdccf.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class LibraryService {

    @Autowired
    LibraryRepository libraryRepository;

    public Library saveLibrary(Library library) {
        return libraryRepository.save(library);
    }
}
