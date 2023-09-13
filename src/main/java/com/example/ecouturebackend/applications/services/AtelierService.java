package com.example.ecouturebackend.applications.services;

import com.example.ecouturebackend.domaines.entities.Atelier;
import com.example.ecouturebackend.domaines.entities.User;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface AtelierService {
    ResponseEntity<?> addAtelier(Atelier atelier);
    List<Atelier> getAtelier();


    Optional<Atelier> getAtelierById(Long atelierId);

    ResponseEntity<?> updateAtelier(Atelier atelier, Long atelierId);

    ResponseEntity<?> deleteAtelier(Long atelierId);
}
