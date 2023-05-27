package com.website.main_aplication_steins_now.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.lang.reflect.Type;
import java.util.Date;

@Entity
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    public String Username;
    public String Email;
    public Date Date_of_Birth;

}
