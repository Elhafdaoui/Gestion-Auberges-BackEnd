package com.Zakaria.auberge.Services;

import com.Zakaria.auberge.Entities.Charges;

import java.util.List;
import java.util.Optional;

public interface ChargeService {

    public String ajouterCharge(Charges charge);

    public String modifierCharge(Charges charge, Long id);

    public String supprimerCharge(Long id);

    public List<Charges> recupererCharges();

    public Optional<Charges> recupererCharges(Long id);
}
