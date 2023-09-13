//package com.example.ecouturebackend.controllers;
//
//import com.example.ecouturebackend.domaines.entities.Commande;
//import com.example.ecouturebackend.domaines.entities.User;
//import com.example.ecouturebackend.infrastructures.CommandeServiceImp;
//import com.example.ecouturebackend.infrastructures.UserServiceImp;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@CrossOrigin(allowedHeaders = "*", origins = "*")
//@RequestMapping("api/commande")
//public class CommandeController {
//    private final CommandeServiceImp commandeServiceImp;
//
//    public CommandeController(UserServiceImp userServiceImp, CommandeServiceImp commandeServiceImp) {
//        this.commandeServiceImp = commandeServiceImp;
//    }
//    @PostMapping("/add/{token}")
//    public ResponseEntity<?> addCommande(@RequestBody Commande commande, @PathVariable String token){
//        if (token.contains("1234"))
//            return commandeServiceImp.addCommande(commande);
//        return ResponseEntity.badRequest().body("Tocken is not correct");
//    }
//
//    @GetMapping("/get")
//    public List<Commande> getCommandeAll()
//    {
//        return commandeServiceImp.getCommande();
//    }
//
//    @GetMapping("/get/{commandeId}")
//    public Optional<Commande> getCommandeById(@PathVariable("commandeId") Long commandeId)
//    {
//        return commandeServiceImp.getCommandeById(commandeId);
//    }
//
//    @PutMapping ("/update")
//    public ResponseEntity<String> updateCommande(@RequestBody Commande commande) {
//        return CommandeServiceImp.updateCommande(commande, commande.getCommandeId());
//    }
//
//    @DeleteMapping("delete/{commandeId}")
//    public ResponseEntity<?> deleteCommande(@PathVariable("commandeId") Long commandeId)
//    {
//
//        return CommandeServiceImp.deleteCommande();
//    }
//}
