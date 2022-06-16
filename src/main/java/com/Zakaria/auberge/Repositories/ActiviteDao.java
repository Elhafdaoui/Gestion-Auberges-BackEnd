package com.Zakaria.auberge.Repositories;

import com.Zakaria.auberge.Entities.Activites;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ActiviteDao extends JpaRepository<Activites, Long> {
    Optional<Activites> findActivitesByActivite(String activite);
    Optional<Activites> findActivitesById(Long id);
}
