package com.simplon.ldvelhdccf.dto;

import com.simplon.ldvelhdccf.model.Book;
import com.simplon.ldvelhdccf.model.Type;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class BookDto {
    private String title;
    private Set<Type> type;
    private long user_id;

    public static Book convertToBook(BookDto bookDto) {
        return new Book(bookDto.title, bookDto.type);
    }

}
