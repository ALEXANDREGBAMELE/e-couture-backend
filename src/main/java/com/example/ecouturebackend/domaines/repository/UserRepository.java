package com.example.ecouturebackend.domaines.repository;

import com.example.ecouturebackend.domaines.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByMail(String mail);
}
