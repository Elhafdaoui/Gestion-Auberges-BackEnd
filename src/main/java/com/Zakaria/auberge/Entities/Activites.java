package com.Zakaria.auberge.Entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "activites")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Activites {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @NotEmpty(message = "Nom Activité ne peut pas être vide")
    @Size(min=3,message = "Nom d'activité trop court")
    private String activite;
    @NotNull
    @NotEmpty(message = "Lieu cannot be empty")
    private String lieu;
    @NotNull
    @NotEmpty(message = "Prix cannot be empty")
    private String prix; // prix de l'activité
    @NotNull
    @NotEmpty(message = "Statut cannot be empty")
    private String statut;
    @NotNull
    @NotEmpty(message = "Recette cannot be empty")
    private String recette;
    @NotNull
    @NotEmpty(message = "Image cannot be empty")
    private String img;
    @NotNull
    @NotEmpty(message = "Date cannot be empty")
    private String date;
    @NotNull
    @NotEmpty(message = "Heure cannot be empty")
    private String heure;

    public Long getId() {
        return id;
    }

    public String getLieu() {
        return lieu;
    }

    public String getPrix() {
        return prix;
    }

    public String getStatut() {
        return statut;
    }

    public String getDate() {
        return date;
    }

    public String getHeure() {
        return heure;
    }

    public String getRecette() {
        return recette;
    }

    public String getImg() {
        return img;
    }

    public String getActivite() {
        return activite;
    }
}
