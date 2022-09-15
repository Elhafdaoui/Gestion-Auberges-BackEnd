package com.Zakaria.auberge.Entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;

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
    @NotNull
    @NotEmpty(message = "Charge cannot be empty")
    @Size(min = 3, message = "Nom client trop court")
    private String client;
    @NotNull
    @NotEmpty(message = "Charge cannot be empty")
    @Email(message = "Email invalide", regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
    public String email;
    @NotNull
    @NotEmpty(message = "Phone cannot be empty")
    @Size(min = 10,message = "Numero de téléphone invalide")
    @Pattern(regexp = "^\\s?((\\+[1-9]{1,4}[ \\-]*)|(\\([0-9]{2,3}\\)[ \\-]*)|([0-9]{2,4})[ \\-]*)*?[0-9]{3,4}?[ \\-]*[0-9]{3,4}?\\s?",message = "Invalid phone number")
    public String phone;
    @NotNull
    @NotEmpty(message = "Age cannot be empty")
    private String age;
    @NotNull
    @NotEmpty(message = "Date cannot be empty")
    private String dateArrivee;
    @NotNull
    @NotEmpty(message = "Date cannot be empty")
    private String dateSortie;
    @NotNull
    @NotEmpty(message = "Cin cannot be empty")
    //@UniqueElements
    @Size(min = 7,message = "Invalid Cin")
    private String cin;
    @NotNull
    @NotEmpty(message = "Origine cannot be empty")
    private String origine;
    @NotNull
    @NotEmpty(message = "Image cannot be empty")
    private String img;
    @NotNull
    @NotEmpty(message = "Nationalité cannot be empty")
    private String nationalite;
    @NotNull
    @NotEmpty(message = "Adresse cannot be empty")
    private String adresse;
    @NotNull
    @NotEmpty(message = "Statut cannot be empty")
    private String statut;
    @NotNull
    @NotEmpty(message = "Type cannot be empty")
    private String type; //avec ou sans consommation
    @NotNull
    @NotEmpty(message = "Total cannot be empty")
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
