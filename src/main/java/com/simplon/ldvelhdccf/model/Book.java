package com.simplon.ldvelhdccf.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Table(name = "Book")
@Data
@Entity
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title")
    private String title;

//    @ManyToOne
//    @JoinColumn(name ="user_id")
//    private User user;

    @ElementCollection(targetClass = Type.class)
    @CollectionTable(name = "BookType",
            joinColumns = @JoinColumn(name = "BookId"))
    @Enumerated(EnumType.STRING)
    @Column(name = "TypeName")
    private Set<Type> type;

    public Book(String title, Set<Type> type) {
        this.title = title;
        this.type = type;
    }
    @OneToMany
    private List<Chapter> chapter;

}