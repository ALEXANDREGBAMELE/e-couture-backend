package com.example.ecouturebackend.domaines.repository;


import com.example.ecouturebackend.domaines.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Roles, Long> {
}