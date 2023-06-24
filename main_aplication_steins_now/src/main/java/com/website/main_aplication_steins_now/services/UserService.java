package com.website.main_aplication_steins_now.services;

import com.website.main_aplication_steins_now.models.UserModel;
import com.website.main_aplication_steins_now.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public BCryptPasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();

    }

    public UserModel addEntity(UserModel user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return this.userRepository.save(user);
    }
}
