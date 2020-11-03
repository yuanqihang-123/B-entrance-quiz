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
    //TODO GTB-知识点: - UserController.java:17 推荐构造器注入
    @Autowired
    UserService userService;

    @GetMapping(path = "/users")
    @ResponseStatus(HttpStatus.OK)
    public List<User> getUsers() {
        return userService.getUsers();
    }

    //TODO GTB-知识点: - UserController.java:27 path命名不符合restful实践，不应该包含动词
    @GetMapping(path = "/users/split")
    @ResponseStatus(HttpStatus.OK)
    public Map<String,List<User>> getUsersRandomList() {
        return userService.getUsersRandomList();
    }

    //TODO GTB-完成度: - 缺少添加学员的api
    //TODO GTB-完成度: - 缺少查看分组的api

}
