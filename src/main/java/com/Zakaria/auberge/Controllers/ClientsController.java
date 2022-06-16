package com.Zakaria.auberge.Controllers;

import com.Zakaria.auberge.Entities.Clients;
import com.Zakaria.auberge.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping(path = "/")
@RestController
@CrossOrigin
public class ClientsController {

    @Autowired
    private ClientService clientService;

    @GetMapping(path = "dashboard/clients/{id}")
    public Optional<Clients> recupererClient(@PathVariable Long id) {
        return clientService.recupererClient(id);
    }

    @GetMapping(path = "dashboard/clients")
    public List<Clients> recupererClients() {
        return clientService.recupererClients();
    }

    @PostMapping(path = "dashboard/clients/new")
    public String ajouterClient(@RequestBody Clients client) {
        return clientService.ajouterClient(client);
    }

    @PutMapping(path = "dashboard/clients/update/{id}")
    public String modifierClient(@RequestBody Clients client, @PathVariable Long id) {
        return clientService.modifierClient(client, id);
    }

    @DeleteMapping(path = "dashboard/clients/{id}")
    public String supprimerClient(@PathVariable Long id) {
        return clientService.supprimerClient(id);
    }
}
