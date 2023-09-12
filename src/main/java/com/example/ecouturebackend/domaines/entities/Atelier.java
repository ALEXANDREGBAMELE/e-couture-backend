package com.example.ecouturebackend.domaines.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Atelier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long atelierId;

    @ManyToOne
    private User user;


}
