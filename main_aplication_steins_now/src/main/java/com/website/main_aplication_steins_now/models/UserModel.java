package com.website.main_aplication_steins_now.models;


import jakarta.persistence.*;

import java.sql.Date;
import java.util.Set;

@Entity
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int Id;

    public String username;
    private  String Password;

    @Temporal(TemporalType.DATE)
    private Date birthDate;

    public String email;

    @ManyToMany
    private Set<Roles> Roles;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return Password;
    }

    public String GetUsername() {
        return username;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setRoles(Set<com.website.main_aplication_steins_now.models.Roles> roles) {
        Roles = roles;
    }
}
