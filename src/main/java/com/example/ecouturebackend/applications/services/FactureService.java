package com.example.ecouturebackend.applications.services;


import com.example.ecouturebackend.domaines.entities.Facture;
import com.example.ecouturebackend.domaines.entities.User;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface FactureService {
    ResponseEntity<?> addFacture(Facture facture);
    List<Facture> getFacture();


    Optional<Facture> getFactureById(Long factureId);

    ResponseEntity<?> updateFacture(Facture facture, Long factureId);

    ResponseEntity<?> deleteFacture(Long factureId);
}