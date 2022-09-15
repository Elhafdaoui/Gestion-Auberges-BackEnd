package com.Zakaria.auberge.Entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

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
    @NotNull
    @NotEmpty(message = "Produit cannot be empty")
    private String produit;
    @NotNull
    @NotEmpty(message = "Prix cannot be empty")
    private String prix;
    @NotNull
    @NotEmpty(message = "Quantité cannot be empty")
    private String quantiteInitiale;
    @NotNull
    @NotEmpty(message = "Quantité cannot be empty")
    private String quantiteRestante;
    @NotNull
    @NotEmpty(message = "Fournisseur cannot be empty")
    private String fournisseur;
    @NotNull
    @NotEmpty(message = "Phone number cannot be empty")
    @Size(min = 7,message = "Invalid Cin")
    private String cin;
    @NotNull
    @NotEmpty(message = "Phone number cannot be empty")
    @Size(min = 10,message = "Numero de téléphone invalide")
    @Pattern(regexp = "^\\s?((\\+[1-9]{1,4}[ \\-]*)|(\\([0-9]{2,3}\\)[ \\-]*)|([0-9]{2,4})[ \\-]*)*?[0-9]{3,4}?[ \\-]*[0-9]{3,4}?\\s?",message = "Invalid phone number")
    private String phone;
    @NotNull
    @NotEmpty(message = "Date number cannot be empty")
    private String dateImport;
    @NotNull
    @NotEmpty(message = "Date number cannot be empty")
    private String dateExpiration;
    @NotNull
    @NotEmpty(message = "Statut number cannot be empty")
    private String statut;
    @NotNull
    @NotEmpty(message = "Etat number cannot be empty")
    private String etat;
    @NotNull
    @NotEmpty(message = "Image number cannot be empty")
    private String img;
    @NotNull
    @NotEmpty(message = "Ville number cannot be empty")
    private String ville;
    @NotNull
    @NotEmpty(message = "Recette number cannot be empty")
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