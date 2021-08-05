package com.simplon.ldvelhdccf.repository;

import com.simplon.ldvelhdccf.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Long> {
}
