package com.simplon.ldvelhdccf.service;

import com.simplon.ldvelhdccf.model.Book;
import com.simplon.ldvelhdccf.model.User;
import com.simplon.ldvelhdccf.repository.BookRepository;
import com.simplon.ldvelhdccf.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Iterable<User> getAllUser(){
        return userRepository.findAll();
    }

    public User getUserById(long id) {
        return userRepository.findById(id).orElseThrow();
    }
}
