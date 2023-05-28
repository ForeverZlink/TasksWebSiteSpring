package com.website.main_aplication_steins_now.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;

    private String role;
}