package com.example.ecouturebackend.domaines.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

public class LigneCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ligneCommandeId;

    @Column(name = "quantite")
    private Integer quantite;

    @Column(name = "prixUnitaire")
    private Double prixUnitaire;

    @ManyToOne
    @JoinColumn(name = "commande_id")
    private Commande commande;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
}
