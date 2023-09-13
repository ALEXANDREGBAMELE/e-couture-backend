package com.example.ecouturebackend.domaines.repository;

import com.example.ecouturebackend.domaines.entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture,Long> {
}
