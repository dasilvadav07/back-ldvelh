package com.simplon.ldvelhdccf.controller;

import com.simplon.ldvelhdccf.model.Book;
import com.simplon.ldvelhdccf.model.Chapter;
import com.simplon.ldvelhdccf.service.ChapterService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Data
@RestController
@RequestMapping("/api/book/{id}/chapter")
public class ChapterController {

    @Autowired
    ChapterService chapterService;

    @GetMapping("/{id}")
    public Chapter chapter(@PathVariable int id) {
        return chapterService.getChapterById(id);
    }

    @PutMapping("/{id}")
    public Chapter updateChapter(@PathVariable int id, @RequestBody Chapter chapter) {
        return chapterService.saveChapter(chapter);
    }

    @PostMapping("/{id}")
    public Chapter postChapter(@PathVariable int id, @RequestBody Chapter chapter) {
        return chapterService.saveChapter(chapter);
    }
}
