package com.website.main_aplication_steins_now.models;


import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int Id;

    private String Username;
    private  String Password;

    @Temporal(TemporalType.DATE)
    private Date birthDate;

    public String Email;

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public String getUsername() {
        return Username;
    }
}
