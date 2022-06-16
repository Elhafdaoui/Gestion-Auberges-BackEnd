package com.Zakaria.auberge.Entities;

import lombok.*;

import javax.persistence.*;

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
    private String recettes; // total des recettes
    private String depenses; // total des charges ( dépenses )
    private String bilan; // bilan = recettes-depenses
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
