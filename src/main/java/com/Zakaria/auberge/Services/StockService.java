package com.Zakaria.auberge.Services;

import com.Zakaria.auberge.Entities.Stocks;

import java.util.List;
import java.util.Optional;

public interface StockService {

    public String ajouterProduit(Stocks produit);

    public String supprimerProduit(Long id);

    public String modifierProduit(Stocks produit,Long id);

    public List<Stocks> recupererProduits();

    public Optional<Stocks> recupererProduit(Long id);
}
