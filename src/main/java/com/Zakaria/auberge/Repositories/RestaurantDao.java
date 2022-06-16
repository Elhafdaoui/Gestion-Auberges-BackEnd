package com.Zakaria.auberge.Repositories;

import com.Zakaria.auberge.Entities.Restaurants;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RestaurantDao extends JpaRepository<Restaurants, Long> {
    Optional<Restaurants> findRestaurantsByRestaurant(String restaurant);
    Optional<Restaurants> findRestaurantsById(Long id);
}
