package com.Zakaria.auberge.Entities;

import lombok.*;

import javax.persistence.*;

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
    private String activite;
    private String lieu;
    private String prix; // prix de l'activité
    private String statut;
    private String recette;
    private String img;
    private String date;
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
