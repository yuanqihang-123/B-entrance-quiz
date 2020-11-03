package com.thoughtworks.capability.gtb.entrancequiz.repository;

import com.thoughtworks.capability.gtb.entrancequiz.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
//TODO GTB-工程实践: - UserRespository拼写错误
public interface UserRespository extends JpaRepository<User,Integer> {
}
