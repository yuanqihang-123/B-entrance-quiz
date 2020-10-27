package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.entity.User;
import com.thoughtworks.capability.gtb.entrancequiz.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRespository userRespository;

    public List<User> getUsers() {
        return userRespository.findAll();
    }
}
