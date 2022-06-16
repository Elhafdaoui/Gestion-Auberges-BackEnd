package com.Zakaria.auberge.Services;

import com.Zakaria.auberge.Entities.Restaurants;

import java.util.List;
import java.util.Optional;

public interface RestaurantService {

    public String ajouterRestaurant(Restaurants restaurant);

    public String modifierRestaurant(Restaurants restaurant, Long id);

    public String supprimerRestaurant(Long id);

    public List<Restaurants> recupererRestaurants();

    public Optional<Restaurants> recupererRestaurant(Long id);
}
