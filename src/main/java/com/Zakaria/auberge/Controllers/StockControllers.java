package com.Zakaria.auberge.Controllers;

import com.Zakaria.auberge.Entities.Stocks;
import com.Zakaria.auberge.Services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/")
@CrossOrigin
public class StockControllers {

    @Autowired
    private StockService stockService;

    @GetMapping(path = "dashboard/stock")
    public List<Stocks> recupererProduits() {
        return stockService.recupererProduits();
    }

    @GetMapping(path = "dashboard/stock/{id}")
    public Optional<Stocks> recupererProduit(@PathVariable Long id) {
        return stockService.recupererProduit(id);
    }

    @PostMapping(path = "dashboard/stock/new")
    public String ajouterProduit(@RequestBody Stocks produit) {
        return stockService.ajouterProduit(produit);
    }

    @PutMapping(path = "dashboard/stock/update/{id}")
    public String modifierProduit(@RequestBody Stocks produit, @PathVariable Long id) {
        return stockService.modifierProduit(produit,id);
    }

    @DeleteMapping(path = "dashboard/stock/{id}")
    public String supprimerProduit(@PathVariable Long id) {
        return stockService.supprimerProduit(id);
    }

}