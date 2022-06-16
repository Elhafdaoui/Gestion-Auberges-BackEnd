package com.Zakaria.auberge.Entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clients")
@ToString
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String client;
    public String email;
    public String phone;
    private String age;
    private String dateArrivee;
    private String dateSortie;
    private String cin;
    private String origine;
    private String img;
    private String nationalite;
    private String adresse;
    private String statut;
    private String type; //avec ou sans consommation
    private String total; // total payé

    public String getEmail() {
        return email;
    }

    public Long getId() {
        return id;
    }

    public String getClient() {
        return client;
    }

    public String getPhone() {
        return phone;
    }

    public String getAge() {
        return age;
    }

    public String getDateArrivee() {
        return dateArrivee;
    }

    public String getDateSortie() {
        return dateSortie;
    }

    public String getCin() {
        return cin;
    }

    public String getOrigine() {
        return origine;
    }

    public String getImg() {
        return img;
    }

    public String getNationalite() {
        return nationalite;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getStatut() {
        return statut;
    }

    public String getType() {
        return type;
    }

    public String getTotal() {
        return total;
    }
}
