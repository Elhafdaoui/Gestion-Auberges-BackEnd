package com.Zakaria.auberge.Services;

import com.Zakaria.auberge.Entities.Bilan;

import java.util.List;
import java.util.Optional;

public interface BilanService {

    public String ajouterBilan(Bilan bilan);

    public String modifierBilan(Bilan bilan, Long id);

    public String supprimerBilan(Long id);

    public List<Bilan> recupererBilans();

    public Optional<Bilan> recupererBilan(Long id);
}
