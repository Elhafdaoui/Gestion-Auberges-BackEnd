package com.Zakaria.auberge.Services;

import com.Zakaria.auberge.Entities.Consommations;

import java.util.List;
import java.util.Optional;

public interface ConsommationService {

    public String ajouterConsommation(Consommations Consommation);

    public String supprimerConsommation(Long id);

    public String modifierConsommation(Consommations Consommation, Long id);

    public List<Consommations> recupererConsommations();

    public Optional<Consommations> recupererConsommation(Long id);
}
