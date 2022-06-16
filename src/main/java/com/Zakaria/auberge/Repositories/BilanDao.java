package com.Zakaria.auberge.Repositories;

import com.Zakaria.auberge.Entities.Bilan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BilanDao extends JpaRepository<Bilan, Long> {
    Optional<Bilan> findBilanByDate(String date);
    Optional<Bilan> findBilanById(Long id);
}
