package com.example.ecouturebackend.applications.services;


import com.example.ecouturebackend.domaines.entities.Commande;
import com.example.ecouturebackend.domaines.entities.User;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface CommandeService {
    ResponseEntity<?> addCommande(Commande commande);
    List<Commande> getCommande();


    Optional<Commande> getCommandeById(Long userId);

    ResponseEntity<?> updateCommande(Commande commande, Long commandeId);

    ResponseEntity<?> deleteCommande(Long commandeId);
}