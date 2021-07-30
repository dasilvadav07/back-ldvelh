package com.simplon.ldvelhdccf.controller;

import com.simplon.ldvelhdccf.model.Book;
import com.simplon.ldvelhdccf.model.Chapter;
import com.simplon.ldvelhdccf.repository.ChapterRepository;
import com.simplon.ldvelhdccf.service.ChapterService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Data
@RestController
@RequestMapping("/api/chapters")
public class ChapterController {

    @Autowired ChapterService chapterService;


    @PostMapping("/{idBook}/create")
    @CrossOrigin("http://localhost:4200")
    public Chapter postChapter(@RequestBody Chapter chapter, @PathVariable int idBook) {
        return chapterService.saveChapter(chapter);
    }
}
