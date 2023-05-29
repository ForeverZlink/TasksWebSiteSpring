package com.website.main_aplication_steins_now.models;


import jakarta.persistence.*;

import java.sql.Date;
import java.util.Set;

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

    @ManyToMany
    private Set<Roles> Roles;

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public String getUsername() {
        return Username;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setRoles(Set<com.website.main_aplication_steins_now.models.Roles> roles) {
        Roles = roles;
    }
}
