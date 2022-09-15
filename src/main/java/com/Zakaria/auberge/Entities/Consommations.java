package com.Zakaria.auberge.Entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;

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
    @NotNull
    @NotEmpty(message = "Produit cannot be empty")
    private String produit;
    @NotNull
    @NotEmpty(message = "Prix cannot be empty")
    private String prix; // Prix de la consommation (Combien il coute dans le menu)
    @NotNull
    @NotEmpty(message = "Nom client cannot be empty")
    private String client;
    @NotNull
    @NotEmpty(message = "Cin cannot be empty")
    @Size(min = 7,message = "Invalid Cin")
    private String cin;
    @NotNull
    @NotEmpty(message = "Quantité cannot be empty")
    private String quantite; // Quantité consommer du produit par le client
    @NotNull
    @NotEmpty(message = "Restaurant cannot be empty")
    private String restaurant;
    @NotNull
    @NotEmpty(message = "Recette cannot be empty")
    private String recette; // Combien on a gagner de ce produit
    @NotNull
    @NotEmpty(message = "Date cannot be empty")
    private String date;
    @NotNull
    @NotEmpty(message = "Heure cannot be empty")
    private String heure;
    @NotNull
    @NotEmpty(message = "Email cannot be empty")
    @Email(message = "Email invalide", regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
    private String email;
    @NotNull
    @NotEmpty(message = "Phone number cannot be empty")
    @Size(min = 10,message = "Numero de téléphone invalide")
    @Pattern(regexp = "^\\s?((\\+[1-9]{1,4}[ \\-]*)|(\\([0-9]{2,3}\\)[ \\-]*)|([0-9]{2,4})[ \\-]*)*?[0-9]{3,4}?[ \\-]*[0-9]{3,4}?\\s?",message = "Invalid phone number")
    private String phone;
    @NotNull
    @NotEmpty(message = "Image cannot be empty")
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
