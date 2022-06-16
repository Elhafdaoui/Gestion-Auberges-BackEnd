package com.Zakaria.auberge.Implementations;

import com.Zakaria.auberge.Repositories.ChargesDao;
import com.Zakaria.auberge.Entities.Charges;
import com.Zakaria.auberge.Services.ChargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChargeImplementation implements ChargeService {

    @Autowired
    ChargesDao chargesDao;

    @Override
    public String ajouterCharge(Charges charge) {
        if(chargesDao.findChargesByCharge(charge.getCharge()).isPresent())
            return "Charge existe déjà";

        chargesDao.save(charge);
        return "ajouter avec succès";
    }

    @Override
    public String modifierCharge(Charges charge, Long id) {

        if(chargesDao.findChargesById(charge.getId()).isPresent()){
            chargesDao.save(charge);
            return "modifier avec succès";
        }
        else{
            return "Introuvable !";
        }

    }

    @Override
    public String supprimerCharge(Long id) {
        chargesDao.deleteById(id);
        return "Charge(s) supprimer avec succès";
    }

    @Override
    public List<Charges> recupererCharges() {
        return chargesDao.findAll();
    }

    @Override
    public Optional<Charges> recupererCharges(Long id) {
        return chargesDao.findById(id);
    }

}
