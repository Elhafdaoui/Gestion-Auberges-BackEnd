package com.Zakaria.auberge.Entities;

import lombok.*;

import javax.persistence.*;

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
    private String chambre;
    private String etat;
    private String client;
    private String email;
    private String phone;
    private String cin;
    private String nationalite;
    private String methode; // Méthode de paiement
    private String montant; // Montant payé par le client
    private String dateReservation;
    private String finReservation;
    private String statut;
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
