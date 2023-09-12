package com.example.ecouturebackend.domaines.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CategorieArticle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long categorieId;
    private String libelleCategorie;

}
