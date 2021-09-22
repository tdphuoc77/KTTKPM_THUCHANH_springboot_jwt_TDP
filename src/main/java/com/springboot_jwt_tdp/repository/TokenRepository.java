package com.springboot_jwt_tdp.repository;


import com.springboot_jwt_tdp.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository
        extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
