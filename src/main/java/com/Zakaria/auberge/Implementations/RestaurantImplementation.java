package com.Zakaria.auberge.Implementations;

import com.Zakaria.auberge.Repositories.RestaurantDao;
import com.Zakaria.auberge.Entities.Restaurants;
import com.Zakaria.auberge.Services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantImplementation implements RestaurantService {

    @Autowired
    RestaurantDao restaurantDao;

    @Override
    public String ajouterRestaurant(Restaurants restaurant) {
       if(restaurantDao.findRestaurantsByRestaurant(restaurant.getRestaurant()).isPresent())
            return "Restaurant existe déjà";

        restaurantDao.save(restaurant);
        return "ajouter avec succès";
    }

    @Override
    public String modifierRestaurant(Restaurants restaurant, Long id) {

        if(restaurantDao.findRestaurantsById(restaurant.getId()).isPresent()){
            restaurantDao.save(restaurant);
            return "modifier avec succès";
        }
        else{
            return "Introuvable !";
        }

    }

    @Override
    public String supprimerRestaurant(Long id) {
        restaurantDao.deleteById(id);
        return "Restaurant(s) supprimer avec succès";
    }

    @Override
    public List<Restaurants> recupererRestaurants() {
        return restaurantDao.findAll();
    }

    @Override
    public Optional<Restaurants> recupererRestaurant(Long id) {
        return restaurantDao.findById(id);
    }

}
