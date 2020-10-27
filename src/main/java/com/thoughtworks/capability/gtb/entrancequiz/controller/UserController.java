package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.entity.User;
import com.thoughtworks.capability.gtb.entrancequiz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(path = "/users")
    @ResponseStatus(HttpStatus.OK)
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping(path = "/users/split")
    @ResponseStatus(HttpStatus.OK)
    public Map<String,List<User>> getUsersRandomList() {
        return userService.getUsersRandomList();
    }

}
