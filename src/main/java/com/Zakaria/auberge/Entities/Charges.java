package com.Zakaria.auberge.Entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "charge")
public class Charges {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String charge;
    private String dateFacturation;
    private String datePaiement;
    private String statut;
    private String montant; //Montant à payer pour la charge
    private String img;

    public Long getId() {
        return id;
    }

    public String getCharge() {
        return charge;
    }

    public String getDateFacturation() {
        return dateFacturation;
    }

    public String getDatePaiement() {
        return datePaiement;
    }

    public String getStatut() {
        return statut;
    }

    public String getMontant() {
        return montant;
    }

    public String getImg() {
        return img;
    }
}
