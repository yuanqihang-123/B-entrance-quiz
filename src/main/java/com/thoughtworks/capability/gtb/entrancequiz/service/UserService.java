package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.thoughtworks.capability.gtb.entrancequiz.entity.User;
import com.thoughtworks.capability.gtb.entrancequiz.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.*;

@Service
public class UserService {
    @Autowired
    UserRespository userRespository;

    public List<User> getUsers() {
        return userRespository.findAll();
    }

    public Map<String, List<User>> getUsersRandomList() {
        Random random = new Random();
        List<User> users = userRespository.findAll();
        HashMap<String, List<User>> map = new HashMap<>();
        LinkedList<User> ls1 = new LinkedList<>();
        LinkedList<User> ls2 = new LinkedList<>();
        LinkedList<User> ls3 = new LinkedList<>();
        LinkedList<User> ls4 = new LinkedList<>();
        LinkedList<User> ls5 = new LinkedList<>();
        LinkedList<User> ls6 = new LinkedList<>();
        int cicle = users.size()/6;
        for (int i = 0; i < cicle; i++) {
            ls1.add(users.remove(random.nextInt(users.size())));
            ls2.add(users.remove(random.nextInt(users.size())));
            ls3.add(users.remove(random.nextInt(users.size())));
            ls4.add(users.remove(random.nextInt(users.size())));
            ls5.add(users.remove(random.nextInt(users.size())));
            ls6.add(users.remove(random.nextInt(users.size())));
        }

        if(users.size()>0){
            ls1.add(users.remove(random.nextInt(users.size())));
        }
        if(users.size()>0){
            ls2.add(users.remove(random.nextInt(users.size())));
        }
        if(users.size()>0){
            ls3.add(users.remove(random.nextInt(users.size())));
        }
        if(users.size()>0){
            ls4.add(users.remove(random.nextInt(users.size())));
        }
        if(users.size()>0){
            ls5.add(users.remove(random.nextInt(users.size())));
        }
        map.put("1 组",ls1);
        map.put("2 组",ls2);
        map.put("3 组",ls3);
        map.put("4 组",ls4);
        map.put("5 组",ls5);
        map.put("6 组",ls6);
        return map;
    }
}
