package com.Zakaria.auberge.Repositories;

import com.Zakaria.auberge.Entities.Charges;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ChargesDao extends JpaRepository<Charges, Long> {
    Optional<Charges> findChargesByCharge(String charge);
    Optional<Charges> findChargesById(Long id);
}
