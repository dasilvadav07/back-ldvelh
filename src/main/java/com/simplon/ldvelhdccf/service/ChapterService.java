package com.simplon.ldvelhdccf.service;

import com.simplon.ldvelhdccf.model.Book;
import com.simplon.ldvelhdccf.model.Chapter;
import com.simplon.ldvelhdccf.repository.ChapterRepository;
import com.simplon.ldvelhdccf.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ChapterService {

    @Autowired
    ChapterRepository chapterRepository;

    public Iterable<Chapter> getAllChapter(){
        return chapterRepository.findAll();
    }

    public Chapter getChapterById(int id) {
        return chapterRepository.findById(id).orElseThrow();
    }

    public Chapter saveChapter(Chapter chapter) {
        return chapterRepository.save(chapter);
    }

    public void deleteChapter(int id) {  chapterRepository.deleteById(id); }

}
