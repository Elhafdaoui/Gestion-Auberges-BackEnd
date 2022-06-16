package com.Zakaria.auberge.Implementations;

import com.Zakaria.auberge.Repositories.StockDao;
import com.Zakaria.auberge.Entities.Stocks;
import com.Zakaria.auberge.Services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class StockImplementation implements StockService {

    @Autowired
    StockDao stockDao;

    @Override
    public String ajouterProduit(@RequestBody Stocks produit) {
        if(stockDao.findStocksByProduit(produit.getProduit()).isPresent())
            return "Produit existe déjà!";

        stockDao.save(produit);
        return "ajouter avec succès";
    }

    @Override
    public String supprimerProduit(Long id) {
        stockDao.deleteById(id);
        return "Produit(s) supprimer avec succès";
    }

    @Override
    public String modifierProduit(Stocks produit, Long id) {

        if(stockDao.findStocksById(produit.getId()).isPresent()){
            stockDao.save(produit);
            return "modifier avec succès";
        }
        else{
            return "Introuvable !";
        }

    }

    @Override
    public List<Stocks> recupererProduits() {
        return stockDao.findAll();
    }

    @Override
    public Optional<Stocks> recupererProduit(Long id) {
        return stockDao.findById(id);
    }

}
