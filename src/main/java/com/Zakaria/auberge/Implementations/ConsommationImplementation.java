package com.Zakaria.auberge.Implementations;

import com.Zakaria.auberge.Repositories.ConsommationDao;
import com.Zakaria.auberge.Entities.Consommations;
import com.Zakaria.auberge.Services.ConsommationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsommationImplementation implements ConsommationService {

    @Autowired
    ConsommationDao consommationDao;

    @Override
    public String ajouterConsommation(Consommations consommation) {
       if(consommationDao.findConsommationsByProduitAndDateAndHeure(consommation.getProduit(),consommation.getDate(),consommation.getHeure()).isPresent())
           return "Consommation exite déjà";

        consommationDao.save(consommation);
        return "ajouter avec succès";
    }

    @Override
    public String supprimerConsommation(Long id) {
        consommationDao.deleteById(id);
        return "Consommation(s) supprimer avec succès";
    }

    @Override
    public String modifierConsommation(Consommations consommation, Long id) {

        if(consommationDao.findConsommationsById(consommation.getId()).isPresent()){
            consommationDao.save(consommation);
            return "modifier avec succès";
        }
        else{
            return "Introuvable !";
        }

    }

    @Override
    public List<Consommations> recupererConsommations() {
        return consommationDao.findAll();
    }

    @Override
    public Optional<Consommations> recupererConsommation(Long id) {
        return consommationDao.findById(id);
    }

}
