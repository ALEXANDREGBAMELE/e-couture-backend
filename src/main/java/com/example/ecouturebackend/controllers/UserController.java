package com.example.ecouturebackend.controllers;

import com.example.ecouturebackend.domaines.entities.User;
import com.example.ecouturebackend.infrastructures.UserServiceImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
@RequestMapping("api/user")
public class UserController {
    private final UserServiceImp userServiceImp;

    public UserController(UserServiceImp userServiceImp) {
        this.userServiceImp = userServiceImp;
    }

    /**
     * Ajouter un utilistaeur, cette partie concerne les utilisateurs normaux.
     * @param user
     * @param token
     * @return
     */
    @PostMapping("/add-user/{token}")
    public ResponseEntity<?> addUser(@RequestBody User user, @PathVariable String token){
        if (token.contains("1234"))
            user.setRole("USER"); //donner le role USER
            return userServiceImp.addUser(user);
        return ResponseEntity.badRequest().body("Tocken is not correct");
    }


    /**
     * Cette partie permet d'ajouter un couturier, le formulaire des couturier doit appeler cet endpoint
     * @param user
     * @param token
     * @return
     */

    @PostMapping("/add-couturier/{token}")
    public ResponseEntity<?> addUser(@RequestBody User user, @PathVariable String token){
        if (token.contains("1234"))
            user.setRole("COUTURIER"); //donner le role COUTURIER à l'utilisateur
            return userServiceImp.addUser(user);
        return ResponseEntity.badRequest().body("Tocken is not correct");
    }


    
    /**
     * Cette partie permet d'ajouter un admin, le formulaire des admin doit appeler cet endpoint
     * @param user
     * @param token
     * @return
     */    
    @PostMapping("/add-admin/{token}")
    public ResponseEntity<?> addUser(@RequestBody User user, @PathVariable String token){
        if (token.contains("1234"))
            user.setRole("ADMIN"); //donner le role Admin à l'utilisateur
            return userServiceImp.addUser(user);
        return ResponseEntity.badRequest().body("Tocken is not correct");
    }



    @GetMapping("/get")
    public List<User> getUserAll()
    {
        return userServiceImp.getUser();
    }

    @GetMapping("/get/{userId}")
    public Optional<User> getUserById(@PathVariable("userId") Long userId)
    {
        return userServiceImp.getUserById(userId);
    }

    @PutMapping ("/update")
    public ResponseEntity<String> updateUser(@RequestBody User user) {
        return userServiceImp.updateUser(user, user.getUserId());
    }

    @DeleteMapping("delete/{userId}")
    public ResponseEntity<?> supprimerUtilisateur(@PathVariable("userId") Long userId)
    {


        return userServiceImp.deleteUser(userId);
    }
}
