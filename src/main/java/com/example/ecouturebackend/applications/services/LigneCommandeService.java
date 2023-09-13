package com.example.ecouturebackend.applications.services;


import com.example.ecouturebackend.domaines.entities.Commande;
import com.example.ecouturebackend.domaines.entities.LigneCommande;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface LigneCommandeService {
    ResponseEntity<?> addLigneCommande(LigneCommande ligneCommande);
    List<LigneCommande> getLigneCommande();


    Optional<LigneCommande> getLigneCommandeById(Long ligneCommandeId);

    ResponseEntity<?> updateLigneCommande(LigneCommande ligneCommande, Long ligneCommandeId);

    ResponseEntity<?> deleteLigneCommande(Long ligneCommandeId);
}