package com.Zakaria.auberge.Implementations;

import com.Zakaria.auberge.Repositories.ActiviteDao;
import com.Zakaria.auberge.Entities.Activites;
import com.Zakaria.auberge.Services.ActiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActiviteImplementation implements ActiviteService {

    @Autowired
    ActiviteDao activiteDao;

    @Override
    public String ajouterActivite(Activites activite) {
        if(activiteDao.findActivitesByActivite(activite.getActivite()).isPresent())
            return "Activite existe déjà";

        activiteDao.save(activite);
        return "ajouter avec succès";
    }

    @Override
    public String supprimerActivite(Long id) {
        activiteDao.deleteById(id);
        return "Activité(s) supprimer avec succès";
    }

    @Override
    public String modifierActivite(Activites activite, Long id) {

        if(activiteDao.findActivitesById(activite.getId()).isPresent()){
            activiteDao.save(activite);
            return "modifier avec succès";
        }
        else{
            return "Introuvable !";
        }

    }

    @Override
    public List<Activites> recupererActivites() {
        return activiteDao.findAll();
    }

    @Override
    public Optional<Activites> recupererActivite(Long id) {
        return activiteDao.findById(id);
    }

}
