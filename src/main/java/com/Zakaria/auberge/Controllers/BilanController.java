package com.Zakaria.auberge.Controllers;

import com.Zakaria.auberge.Entities.Bilan;
import com.Zakaria.auberge.Services.BilanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping(path = "/")
@RestController
@CrossOrigin
public class BilanController {

    @Autowired
    private BilanService bilanService;

    @GetMapping("dashboard/recettes")
    public List<Bilan> recupererBilans() {
        return bilanService.recupererBilans();
    }

    @GetMapping("dashboard/recettes/{id}")
    public Optional<Bilan> recupererBilan(@PathVariable Long id) {
        return bilanService.recupererBilan(id);
    }

    @PostMapping("dashboard/recettes/new")
    public String ajouterBilan(@RequestBody Bilan bilan) {
        return bilanService.ajouterBilan(bilan);
    }

    @PutMapping("dashboard/recettes/update/{id}")
    public String modifierBilan(@RequestBody Bilan bilan, @PathVariable Long id) {
        return bilanService.modifierBilan(bilan,id);
    }

    @DeleteMapping(path = "dashboard/recettes/{id}")
    public String supprimerBilan(@PathVariable Long id) {
        return bilanService.supprimerBilan(id);
    }
}
