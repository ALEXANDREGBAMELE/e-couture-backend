package com.example.ecouturebackend.infrastructures;

import com.example.ecouturebackend.applications.services.AtelierService;
import com.example.ecouturebackend.domaines.entities.Atelier;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public class AtelierServiceImp implements AtelierService {
    @Override
    public ResponseEntity<?> addAtelier(Atelier atelier) {
        return null;
    }

    @Override
    public List<Atelier> getAtelier() {
        return null;
    }

    @Override
    public Optional<Atelier> getAtelierById(Long atelierId) {
        return Optional.empty();
    }

    @Override
    public ResponseEntity<?> updateAtelier(Atelier atelier, Long atelierId) {
        return null;
    }

    @Override
    public ResponseEntity<?> deleteAtelier(Long atelierId) {
        return null;
    }
}
