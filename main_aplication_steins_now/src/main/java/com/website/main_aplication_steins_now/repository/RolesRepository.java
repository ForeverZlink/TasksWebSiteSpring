package com.website.main_aplication_steins_now.repository;


import com.website.main_aplication_steins_now.models.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.management.relation.Role;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer> {
    Roles findByRole(String role);

}
