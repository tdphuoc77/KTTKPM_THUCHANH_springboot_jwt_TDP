package com.springboot_jwt_tdp.repository;


import com.springboot_jwt_tdp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
        extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
