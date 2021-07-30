package com.simplon.ldvelhdccf.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Map;

@Getter
@Setter
@Entity
@Data
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String content;
    @Enumerated(EnumType.STRING)
    private ChapterRole chapterRole;
    @Enumerated(EnumType.STRING)
    private  Status status;
    private String caption;
    private String question;
    @ManyToMany
    private Map<Integer, Chapter> options;
    @ManyToOne(fetch = FetchType.LAZY)
    private Book book;

}
