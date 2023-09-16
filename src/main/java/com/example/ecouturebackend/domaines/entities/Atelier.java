package com.example.ecouturebackend.domaines.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
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
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id")
    private User user;


}
