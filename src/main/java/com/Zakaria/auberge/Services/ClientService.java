package com.Zakaria.auberge.Services;

import java.util.List;
import java.util.Optional;

import com.Zakaria.auberge.Entities.Clients;

public interface ClientService {

    public String ajouterClient(Clients client);

    public String modifierClient(Clients client, Long id);

    public String supprimerClient(Long id);

    public List<Clients> recupererClients();

    public Optional<Clients> recupererClient(Long id);

}
