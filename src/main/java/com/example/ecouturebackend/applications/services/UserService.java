package com.example.ecouturebackend.applications.services;


import com.example.ecouturebackend.domaines.entities.User;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {
    ResponseEntity<?> addUser(User user);
    List<User> getUser();


    Optional<User> getUserById(Long userId);

    ResponseEntity<?> updateUser(User user, Long userId);

    ResponseEntity<?> deleteUser(Long userId);
}