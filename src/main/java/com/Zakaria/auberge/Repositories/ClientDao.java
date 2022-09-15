package com.Zakaria.auberge.Repositories;

import com.Zakaria.auberge.Entities.Clients;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientDao extends JpaRepository<Clients, Long> {
    Optional<Clients> findClientsByEmail(String email);
    Optional<Clients> findClientsById(Long id);

    Optional<Clients> findClientsByCin(String cin);
}
