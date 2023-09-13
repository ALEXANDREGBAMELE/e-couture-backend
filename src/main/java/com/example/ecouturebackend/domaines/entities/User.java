package com.example.ecouturebackend.domaines.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String nom;
    private String prenom;
    @Column(unique = true, nullable = false)
    private String mail ;
    private String motDePasse;
    private String ConfirmMotDePasse;
    private String telephone ;
    private String dateNaissance ;
    private String adresse;
    private String ville;
    private String codePostal;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_role", referencedColumnName = "id")
    private Roles roles ;

    @OneToMany(mappedBy = "user")
    private List<Atelier> atelier;
}
