package com.Zakaria.auberge.Entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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
    @NotNull
    @NotEmpty(message = "Restaurant cannot be empty")
    private String restaurant;
    @NotNull
    @NotEmpty(message = "Prix cannot be empty")
    private String prix;
    @NotNull
    @NotEmpty(message = "Etat cannot be empty")
    private String etat;
    @NotNull
    @NotEmpty(message = "Statut cannot be empty")
    private String statut;
    @NotNull
    @NotEmpty(message = "Places cannot be empty")
    private String places; // nombre de places
    @NotNull
    @NotEmpty(message = "Recettes cannot be empty")
    private String recette;
    @NotNull
    @NotEmpty(message = "Nature cannot be empty")
    private String nature; //Moderne, Traditionnel
    @NotNull
    @NotEmpty(message = "Image cannot be empty")
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
