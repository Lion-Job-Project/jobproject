package com.likelion.likelionjob.repository;

import com.likelion.likelionjob.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface UserRepository extends JpaRepository<User,Integer> {
    public User findUserByName(String name);
    public User findUserByUsername(String username);
}
