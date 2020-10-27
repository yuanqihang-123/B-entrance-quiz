package com.thoughtworks.capability.gtb.entrancequiz.repository;

import com.thoughtworks.capability.gtb.entrancequiz.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRespositoryTest {

    @Autowired
    UserRespository userRespository;

    @Test
    public void show_get_user_list(){
        List<User> users = userRespository.findAll();
        assertEquals(15, users.size());
        assertEquals("成吉思汗", users.get(0).getName());
    }
}