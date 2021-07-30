package com.simplon.ldvelhdccf.repository;

import com.simplon.ldvelhdccf.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
