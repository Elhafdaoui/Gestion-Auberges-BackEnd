package com.Zakaria.auberge.Controllers;

import com.Zakaria.auberge.Entities.Activites;
import com.Zakaria.auberge.Services.ActiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping(path = "/")
@RestController
@CrossOrigin
public class ActivitesController {

    @Autowired
    private ActiviteService activiteService;

    @GetMapping(path = "/dashboard/activites")
    public List<Activites> recupererActivites() {
        return activiteService.recupererActivites();
    }

    @GetMapping(path = "/dashboard/activites/{id}")
    public Optional<Activites> recupererActivite(@PathVariable Long id) {
        return activiteService.recupererActivite(id);
    }

        @PostMapping(path = "/dashboard/activites/new")
        public String ajouterActivite(@RequestBody Activites activite) {
        return activiteService.ajouterActivite(activite);
    }

        @PutMapping(path = "/dashboard/activites/update/{id}")
        public String modifierActivite(@RequestBody Activites activite, @PathVariable Long id) {
            return activiteService.modifierActivite(activite,id);
    }

        @DeleteMapping(path = "/dashboard/activites/{id}")
        public String supprimerActivite(@PathVariable Long id) {
        return activiteService.supprimerActivite(id);
    }

}
