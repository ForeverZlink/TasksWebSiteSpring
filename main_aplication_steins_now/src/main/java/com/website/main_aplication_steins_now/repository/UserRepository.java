package com.website.main_aplication_steins_now.repository;


import com.website.main_aplication_steins_now.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    UserModel findByEmail(String email);
    UserModel findByUserName(String userName);
}