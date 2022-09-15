package com.Zakaria.auberge.Entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
    @NotNull
    @NotEmpty(message = "Charge cannot be empty")
    @Size(min = 3, message = "Charge trop courte")
    private String charge;
    @NotNull
    @NotEmpty(message = "Date Facturation cannot be empty")
    private String dateFacturation;
    @NotNull
    @NotEmpty(message = "Date paiement cannot be empty")
    private String datePaiement;
    @NotNull
    @NotEmpty(message = "Statut cannot be empty")
    private String statut;
    @NotNull
    @NotEmpty(message = "Montant cannot be empty")
    private String montant; //Montant à payer pour la charge
    @NotNull
    @NotEmpty(message = "Image cannot be empty")
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
