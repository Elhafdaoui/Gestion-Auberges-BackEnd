package com.Zakaria.auberge.Controllers;

import com.Zakaria.auberge.Entities.Charges;
import com.Zakaria.auberge.Services.ChargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping(path = "/")
@RestController
@CrossOrigin
public class ChargesController {

    @Autowired
    private ChargeService chargeService;

    @GetMapping(path = "dashboard/charges")
    public List<Charges> recupererCharges() {
        return chargeService.recupererCharges();
    }

    @GetMapping(path = "dashboard/charges/{id}")
    public Optional<Charges> recupeCharge(@PathVariable Long id) {
        return chargeService.recupererCharges(id);
    }

    @PostMapping(path = "dashboard/charges/new")
    public String ajouterCharge(@RequestBody Charges charge) {
        return chargeService.ajouterCharge(charge);
    }

    @PutMapping(path = "dashboard/charges/update/{id}")
    public String modifierCharge(@RequestBody Charges charge, @PathVariable Long id) {
        return chargeService.modifierCharge(charge,id);
    }

    @DeleteMapping(path = "dashboard/charges/{id}")
    public String supprimerCharge(@PathVariable Long id) {
        return chargeService.supprimerCharge(id);
    }

}
