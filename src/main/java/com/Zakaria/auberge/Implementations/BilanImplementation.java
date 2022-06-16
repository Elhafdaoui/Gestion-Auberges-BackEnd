package com.Zakaria.auberge.Implementations;

import com.Zakaria.auberge.Repositories.BilanDao;
import com.Zakaria.auberge.Entities.Bilan;
import com.Zakaria.auberge.Services.BilanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BilanImplementation implements BilanService {

    @Autowired
    BilanDao bilanDao;

    @Override
    public String ajouterBilan(Bilan bilan) {
        if(bilanDao.findBilanByDate(bilan.getDate()).isPresent())
            return "Le bilan pour ce mois a déjà été établi";

        bilanDao.save(bilan);
        return "ajouter avec succès";
    }

    @Override
    public String modifierBilan(Bilan bilan, Long id) {

        if(bilanDao.findBilanById(bilan.getId()).isPresent()){
            bilanDao.save(bilan);
            return "modifier avec succès";
        }
        else{
            return "Introuvable !";
        }

    }

    @Override
    public String supprimerBilan(Long id) {
        bilanDao.deleteById(id);
        return "Bilan(s) supprimer avec succès";
    }

    @Override
    public List<Bilan> recupererBilans() {
        return bilanDao.findAll();
    }

    @Override
    public Optional<Bilan> recupererBilan(Long id) {
        return bilanDao.findById(id);
    }

}
