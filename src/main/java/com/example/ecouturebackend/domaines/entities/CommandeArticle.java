package com.example.ecouturebackend.domaines.entities;

import java.util.Date;
import java.util.List;

public class CommandeArticle {
    private Long commandeId;
    private Date date;
    private int qtyCommande;
    private List<Article> article;
    private String etatCommande;
    private double prixCommande;
}
