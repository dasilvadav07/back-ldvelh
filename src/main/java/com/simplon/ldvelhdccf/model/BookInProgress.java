package com.simplon.ldvelhdccf.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class BookInProgress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
//    @JoinColumn(name = "book_id")
    private Book book;

    private boolean achieved;

    private int chapter_id;

    public BookInProgress(Book book) {
        this.book = book;
        achieved = false;
        chapter_id = 0;
    }
}
