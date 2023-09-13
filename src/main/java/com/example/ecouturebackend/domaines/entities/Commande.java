package com.example.ecouturebackend.domaines.entities;

import com.example.ecouturebackend.domaines.ennum.CommandeStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "_commande")
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "commande_id")
    private Long commandeId;
    @Column(name = "date")
    private LocalDate date;

    @Column(name = "statut")
    private CommandeStatus statut;

}