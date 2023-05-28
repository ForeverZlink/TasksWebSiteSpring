package com.website.main_aplication_steins_now.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import org.springframework.security.core.userdetails.User;

import java.util.Set;

public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;


    private String role;

    @ManyToMany
    private Set<UserModel> Users;
}