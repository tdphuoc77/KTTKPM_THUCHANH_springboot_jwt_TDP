package com.springboot_jwt_tdp.service;


import com.springboot_jwt_tdp.authen.UserPrincipal;
import com.springboot_jwt_tdp.entity.User;



public interface UserService {
    User createUser(User user);

    UserPrincipal findByUsername(String username);
}
