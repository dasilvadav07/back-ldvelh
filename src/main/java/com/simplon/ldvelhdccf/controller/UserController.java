package com.simplon.ldvelhdccf.controller;

import com.simplon.ldvelhdccf.model.Book;
import com.simplon.ldvelhdccf.model.User;
import com.simplon.ldvelhdccf.service.BookService;
import com.simplon.ldvelhdccf.service.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("")
    public Iterable<User> listUser() {
        return userService.getAllUser();
    }

//    @GetMapping("/creators")
//    public Iterable<User> listCreators() {
//       if(User.getBooksCreated()) {
//
//       }
//           return userService.getAllUser();
//    }
}
