package com.example.ecouturebackend.infrastructures;

import com.example.ecouturebackend.applications.services.ArticleService;
import com.example.ecouturebackend.applications.services.FactureService;
import com.example.ecouturebackend.domaines.entities.Article;
import com.example.ecouturebackend.domaines.entities.Facture;
import com.example.ecouturebackend.domaines.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class FactureServiceImp implements FactureService {

    @Override
    public ResponseEntity<?> addFacture(Facture facture) {
        return null;
    }

    @Override
    public List<Facture> getFacture() {
        return null;
    }

    @Override
    public Optional<Facture> getFactureById(Long factureId) {
        return Optional.empty();
    }

    @Override
    public ResponseEntity<?> updateFacture(Facture facture, Long factureId) {
        return null;
    }

    @Override
    public ResponseEntity<?> deleteFacture(Long factureId) {
        return null;
    }
}
