package com.Zakaria.auberge.Entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "restaurants")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Restaurants {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String restaurant;
    private String prix;
    private String etat;
    private String statut;
    private String places; // nombre de places
    private String recette;
    private String nature; //Moderne, Traditionnel
    private String img;

    public String getRestaurant() {
        return restaurant;
    }

    public Long getId() {
        return id;
    }

    public String getPrix() {
        return prix;
    }

    public String getEtat() {
        return etat;
    }

    public String getStatut() {
        return statut;
    }

    public String getPlaces() {
        return places;
    }

    public String getRecette() {
        return recette;
    }

    public String getNature() {
        return nature;
    }

    public String getImg() {
        return img;
    }
}
