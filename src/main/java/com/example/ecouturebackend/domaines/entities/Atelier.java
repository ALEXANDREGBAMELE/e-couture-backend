package com.example.ecouturebackend.domaines.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "_atelier")
public class Atelier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long atelierId;
    private String nomAtelier;
    private String descriptionAtelier;
    private String Adress;
    private String ville;
    private String codePostal;
    private String horaire;
    @ManyToOne
    private User user;


}
