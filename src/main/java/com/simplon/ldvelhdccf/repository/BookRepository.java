package com.simplon.ldvelhdccf.repository;

import com.simplon.ldvelhdccf.dto.BookDto;
import com.simplon.ldvelhdccf.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
