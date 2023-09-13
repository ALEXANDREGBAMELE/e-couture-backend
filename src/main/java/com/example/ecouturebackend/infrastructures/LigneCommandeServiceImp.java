package com.example.ecouturebackend.infrastructures;

import com.example.ecouturebackend.applications.services.LigneCommandeService;
import com.example.ecouturebackend.applications.services.UserService;
import com.example.ecouturebackend.domaines.entities.Commande;
import com.example.ecouturebackend.domaines.entities.LigneCommande;
import com.example.ecouturebackend.domaines.entities.User;
import com.example.ecouturebackend.domaines.repository.RoleRepository;
import com.example.ecouturebackend.domaines.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LigneCommandeServiceImp implements LigneCommandeService {


    @Override
    public ResponseEntity<?> addLigneCommande(LigneCommande ligneCommande) {
        return null;
    }

    @Override
    public List<LigneCommande> getLigneCommande() {
        return null;
    }

    @Override
    public Optional<LigneCommande> getLigneCommandeById(Long ligneCommandeId) {
        return Optional.empty();
    }

    @Override
    public ResponseEntity<?> updateLigneCommande(LigneCommande ligneCommande, Long ligneCommandeId) {
        return null;
    }

    @Override
    public ResponseEntity<?> deleteLigneCommande(Long ligneCommandeId) {
        return null;
    }
}
