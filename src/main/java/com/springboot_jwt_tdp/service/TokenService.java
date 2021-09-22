package com.springboot_jwt_tdp.service;


import com.springboot_jwt_tdp.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
