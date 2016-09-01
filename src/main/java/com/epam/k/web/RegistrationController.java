package com.epam.k.web;

import com.epam.k.service.UserService;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register() {
        String username = "123";
        String password = "123";
        Document user = new Document();
        userService.setUsername(user, username);
        userService.setPassword(user, password);
        userService.insertOne(user);
        return "index";
    }
}
