package com.Zakaria.auberge.Repositories;

import com.Zakaria.auberge.Entities.Consommations;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ConsommationDao extends JpaRepository<Consommations, Long> {
    Optional<Consommations> findConsommationsByProduitAndDateAndHeure(String produit, String date,String heure);
    Optional<Consommations> findConsommationsById(Long id);
}
