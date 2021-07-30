package com.simplon.ldvelhdccf.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class BookInProgress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
//    @JoinColumn(name = "book_id")
    private Book book;

    private boolean achieved;

    private int chapter_id;


}
