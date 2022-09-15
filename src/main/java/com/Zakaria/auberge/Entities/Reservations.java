package com.Zakaria.auberge.Entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "reservations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Reservations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @NotEmpty(message = "Chambre cannot be empty")
    private String chambre;
    @NotNull
    @NotEmpty(message = "Etat cannot be empty")
    private String etat;
    @NotNull
    @NotEmpty(message = "Client cannot be empty")
    private String client;
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
    @NotEmpty(message = "Phone number cannot be empty")
    @Size(min = 7,message = "Invalid Cin")
    private String cin;
    @NotNull
    @NotEmpty(message = "Nationalité cannot be empty")
    private String nationalite;
    @NotNull
    @NotEmpty(message = "Méthode cannot be empty")
    private String methode; // Méthode de paiement
    @NotNull
    @NotEmpty(message = "Montant cannot be empty")
    private String montant; // Montant payé par le client
    @NotNull
    @NotEmpty(message = "Date cannot be empty")
    private String dateReservation;
    @NotNull
    @NotEmpty(message = "Date cannot be empty")
    private String finReservation;
    @NotNull
    @NotEmpty(message = "Statut cannot be empty")
    private String statut;
    @NotNull
    @NotEmpty(message = "Recette cannot be empty")
    private String recette;

    public Long getId() {
        return id;
    }

    private String img;


    public String getDateReservation() {
        return dateReservation;
    }

    public String getFinReservation() {
        return finReservation;
    }

    public String getChambre() {
        return chambre;
    }

    public String getEtat() {
        return etat;
    }

    public String getClient() {
        return client;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getCin() {
        return cin;
    }

    public String getNationalite() {
        return nationalite;
    }

    public String getMethode() {
        return methode;
    }

    public String getMontant() {
        return montant;
    }

    public String getStatut() {
        return statut;
    }

    public String getRecette() {
        return recette;
    }

    public String getImg() {
        return img;
    }
}
