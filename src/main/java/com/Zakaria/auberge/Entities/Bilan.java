package com.Zakaria.auberge.Entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "bilan")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Bilan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @NotEmpty(message = "Recettes cannot be empty")
    private String recettes; // total des recettes
    @NotNull
    @NotEmpty(message = "Dépenses cannot be empty")
    private String depenses; // total des charges ( dépenses )
    @NotNull
    @NotEmpty(message = "Bilan cannot be empty")
    private String bilan; // bilan = recettes-depenses
    @NotNull
    @NotEmpty(message = "Date cannot be empty")
    private String date;

    public Long getId() {
        return id;
    }

    public String getRecettes() {
        return recettes;
    }

    public String getDepenses() {
        return depenses;
    }

    public String getBilan() {
        return bilan;
    }

    public String getDate() {
        return date;
    }

    public String getStatut() {
        return statut;
    }

    private String statut;
}
