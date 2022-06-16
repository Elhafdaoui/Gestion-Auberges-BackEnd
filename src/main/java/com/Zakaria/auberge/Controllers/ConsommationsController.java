package com.Zakaria.auberge.Controllers;

import com.Zakaria.auberge.Entities.Consommations;
import com.Zakaria.auberge.Services.ConsommationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/")
@CrossOrigin
public class ConsommationsController {

    @Autowired
    private ConsommationService consommationService;

    @GetMapping(path = "dashboard/consommations")
    public List<Consommations> recupererConsommations() {
        return consommationService.recupererConsommations();
    }

    @GetMapping(path = "dashboard/consommations/{id}")
    public Optional<Consommations> recupererConsommation(@PathVariable Long id) {
        return consommationService.recupererConsommation(id);
    }

    @PostMapping(path = "dashboard/consommations/new")
    public String ajouterConsommation(@RequestBody Consommations consommation) {
        return consommationService.ajouterConsommation(consommation);
    }

    @PutMapping(path = "dashboard/consommations/update/{id}")
    public String modifierConsommation(@RequestBody Consommations consommation, @PathVariable Long id) {
        return consommationService.modifierConsommation(consommation,id);
    }

    @DeleteMapping(path = "dashboard/consommations/{id}")
    public String supprimerConsommation(@PathVariable Long id) {
        return consommationService.supprimerConsommation(id);
    }

}
