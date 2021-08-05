package com.simplon.ldvelhdccf.model;

import lombok.Data;
import org.javatuples.Triplet;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(	name = "library_created_books",
            joinColumns = @JoinColumn(name = "library_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))
    private Set<BookInProgress> booksCreated = new HashSet<>();

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(	name = "library_played_books",
            joinColumns = @JoinColumn(name = "library_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))
    private Set<BookInProgress> booksPlayed = new HashSet<>();


}
