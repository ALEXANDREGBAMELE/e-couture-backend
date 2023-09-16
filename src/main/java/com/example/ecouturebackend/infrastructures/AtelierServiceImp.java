package com.example.ecouturebackend.infrastructures;

import com.example.ecouturebackend.applications.services.AtelierService;
import com.example.ecouturebackend.domaines.entities.Atelier;
import com.example.ecouturebackend.domaines.repository.AtelierRepository;

import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class AtelierServiceImp implements AtelierService {

    private final AtelierRepository repository;

    @Override
    public ResponseEntity<?> addAtelier(Atelier atelier) {
        return null;
    }

    @Override
    public List<Atelier> getAtelier() {
        return repository.findAll();
    }

    @Override
    public Optional<Atelier> getAtelierById(Long atelierId) {
        Optional<Atelier> atelier = repository.findById(atelierId);
        return atelier;
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
