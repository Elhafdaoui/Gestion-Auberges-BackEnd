package com.Zakaria.auberge.Services;

import com.Zakaria.auberge.Entities.Activites;

import java.util.List;
import java.util.Optional;

public interface ActiviteService {

    public String ajouterActivite(Activites activite);

    public String supprimerActivite(Long id);

    public String modifierActivite(Activites activite, Long id);

    public List<Activites> recupererActivites();

    public Optional<Activites> recupererActivite(Long id);
}
