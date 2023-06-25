package com.website.main_aplication_steins_now.models;


import jakarta.persistence.*;

import java.sql.Date;
import java.util.Set;

@Entity
@Table(name="user")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int Id;

    private String username;
    private  String password;

    private boolean enabled;

    public int getId() {
        return Id;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Temporal(TemporalType.DATE)
    private Date birthDate;

    public String email;

    @ManyToMany
    private Set<Roles> Roles;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email=email;

    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoles(Set<com.website.main_aplication_steins_now.models.Roles> roles) {
        Roles = roles;
    }
}
