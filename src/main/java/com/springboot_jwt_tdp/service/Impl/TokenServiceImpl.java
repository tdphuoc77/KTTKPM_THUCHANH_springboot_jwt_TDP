package com.springboot_jwt_tdp.service.Impl;

import com.springboot_jwt_tdp.entity.Token;
import com.springboot_jwt_tdp.repository.TokenRepository;
import com.springboot_jwt_tdp.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl implements TokenService {

    @Autowired
    private TokenRepository tokenRepository;

    public Token createToken(Token token) {
        return tokenRepository.saveAndFlush(token);
    }

    @Override
    public Token findByToken(String token) {
        return tokenRepository.findByToken(token);
    }
}

