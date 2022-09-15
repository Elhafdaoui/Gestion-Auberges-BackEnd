package com.Zakaria.auberge.Implementations;

import com.Zakaria.auberge.Repositories.ClientDao;
import com.Zakaria.auberge.Entities.Clients;
import com.Zakaria.auberge.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientImplementation implements ClientService {

    @Autowired
    private ClientDao clientDao;

    @Override
    public String ajouterClient(Clients client) {
        if(clientDao.findClientsByCin(client.getCin()).isPresent())
            return "Client existe déjà ";

        clientDao.save(client);
        return "ajouter avec succès";
    }

    @Override
    public String modifierClient(Clients client, Long id) {

        if(clientDao.findClientsById(client.getId()).isPresent()){
            clientDao.save(client);
            return "modifier avec succès";
        }
        else{
            return "Introuvable !";
        }

    }

    @Override
    public String supprimerClient(Long id) {
        clientDao.deleteById(id);
        return "Client(s) supprimer avec succès";
    }

    @Override
    public List<Clients> recupererClients() {
        return clientDao.findAll();
    }

    @Override
    public Optional<Clients> recupererClient(Long id) {
        return clientDao.findClientsById(id);
    }

}
