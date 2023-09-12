package com.example.ecouturebackend.infrastructures;

import com.example.ecouturebackend.applications.services.UserService;
import com.example.ecouturebackend.domaines.entities.User;
import com.example.ecouturebackend.domaines.repository.RoleRepository;
import com.example.ecouturebackend.domaines.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository repository;
    @Override
    public ResponseEntity<?> addUser(User user) {
        Optional<User> user1 = userRepository.findByMail(user.getMail());
        if (user1.isPresent())
        {
            return ResponseEntity.badRequest().body("This user already exists");
        }
        userRepository.save(user);
        return ResponseEntity.ok().body("User created successfully");
    }

    @Override
    public List<User> getUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(Long userId) {
        return userRepository.findById(userId);
    }

    @Override
    public ResponseEntity<String> updateUser(User user, Long userId) {
        Optional<User> user1 = userRepository.findById(userId);
        if (user1.isPresent()){
            User user2 = user1.get();
            user2.setNom(user.getNom());
            user2.setPrenom(user.getPrenom());
            user2.setTelephone(user.getTelephone());
            user2.setMail(user.getMail());
            user2.setDateNaissance(user2.getDateNaissance());
            user2.setMotDePasse(user.getMotDePasse());
            user2.setRoles(user.getRoles());
            userRepository.save(user2);
            return ResponseEntity.ok("User enregistrer");

        }
        return ResponseEntity.badRequest().body("User not found");
    }

    @Override
    public ResponseEntity<?> deleteUser(Long userId) {
        Optional<User> user1 = userRepository.findById(userId);
        if (user1.isPresent()) {
            userRepository.delete(user1.get());
            return ResponseEntity.ok("User deleted successfully");
        }
        return ResponseEntity.badRequest().body("User not exist");
    }

}
