package com.Zakaria.auberge.Entities;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "consommations")
public class Consommations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String produit;
    private String prix; // Prix de la consommation (Combien il coute dans le menu)
    private String client;
    private String cin;
    private String quantite; // Quantité consommer du produit par le client
    private String restaurant;
    private String recette; // Combien on a gagner de ce produit
    private String date;
    private String heure;
    private String email;
    private String phone;
    private String img;

    public Long getId() {
        return id;
    }

    public String getProduit() {
        return produit;
    }

    public String getPrix() {
        return prix;
    }

    public String getClient() {
        return client;
    }

    public String getCin() {
        return cin;
    }

    public String getQuantite() {
        return quantite;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public String getRecette() {
        return recette;
    }

    public String getDate() {
        return date;
    }

    public String getHeure() {
        return heure;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getImg() {
        return img;
    }
}
