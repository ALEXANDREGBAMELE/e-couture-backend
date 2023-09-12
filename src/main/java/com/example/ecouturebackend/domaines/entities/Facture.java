package com.example.ecouturebackend.domaines.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long factureId;
    private Date date;
    @ManyToOne
    @JoinColumn(name = "atelierId", nullable = false,referencedColumnName = "atelierId")
    private Atelier atelier;
}
