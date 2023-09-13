package com.example.ecouturebackend.domaines.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "_article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long articleId;
    private String libelle;
    @Column(name = "description")
    private String description;
    @Column(name = "prix")
    private Double prix;
    @Column(name = "taille")
    private String taille;
    @Column(name = "date_de_creation")
    private Date dateDeCreation ;
    @Column(name = "duree")
    private int duree ;
    @Column(name = "rating")
    private int rating;
    @Column(name = "image")
    private String imgUrl;
    @Column(name = "quantite")
    private Integer quantite;
    @Column(name = "couleur")
    private String couleur;
    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

}

