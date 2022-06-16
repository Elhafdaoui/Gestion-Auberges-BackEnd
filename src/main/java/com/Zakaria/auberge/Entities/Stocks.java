package com.Zakaria.auberge.Entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "stock")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Stocks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String produit;
    private String prix;
    private String quantiteInitiale;
    private String quantiteRestante;
    private String fournisseur;
    private String cin;
    private String phone;
    private String dateImport;
    private String dateExpiration;
    private String statut;
    private String etat;
    private String img;
    private String ville;
    private String recette;

    public String getProduit() {
        return produit;
    }

    public Long getId() {
        return id;
    }

    public String getPrix() {
        return prix;
    }

    public String getQuantiteInitiale() {
        return quantiteInitiale;
    }

    public String getEtat() {
        return etat;
    }

    public String getVille() {
        return ville;
    }

    public String getRecette() {
        return recette;
    }

    public String getQuantiteRestante() {
        return quantiteRestante;
    }

    public String getFournisseur() {
        return fournisseur;
    }

    public String getCin() {
        return cin;
    }

    public String getPhone() {
        return phone;
    }

    public String getDateImport() {
        return dateImport;
    }

    public String getDateExpiration() {
        return dateExpiration;
    }

    public String getStatut() {
        return statut;
    }

    public String getImg() {
        return img;
    }
}