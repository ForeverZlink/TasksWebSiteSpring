package com.website.main_aplication_steins_now.models;

import jakarta.persistence.*;
import org.springframework.security.core.userdetails.User;

import java.util.Set;


@Entity
@Table(name="roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;


    private String role;

    @ManyToMany
    private Set<UserModel> Users;
}