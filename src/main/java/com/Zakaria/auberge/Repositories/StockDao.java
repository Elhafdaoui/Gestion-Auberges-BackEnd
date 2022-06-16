package com.Zakaria.auberge.Repositories;

import com.Zakaria.auberge.Entities.Stocks;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StockDao extends JpaRepository<Stocks,Long> {
    Optional<Stocks> findStocksByProduit(String produit);
    Optional<Stocks> findStocksById(Long id);
}
