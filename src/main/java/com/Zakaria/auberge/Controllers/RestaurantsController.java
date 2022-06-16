package com.Zakaria.auberge.Controllers;

import com.Zakaria.auberge.Entities.Restaurants;
import com.Zakaria.auberge.Services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping(path = "/")
@RestController
@CrossOrigin
public class RestaurantsController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping(path = "dashboard/restaurants")
    public List<Restaurants> recupererRestaurants() {
        return restaurantService.recupererRestaurants();
    }

    @GetMapping(path = "dashboard/restaurants/{id}")
    public Optional<Restaurants> recupererRestaurant(@PathVariable Long id) {
        return restaurantService.recupererRestaurant(id);
    }

    @PostMapping(path = "dashboard/restaurants/new")
    public String ajouterRestaurant(@RequestBody Restaurants restaurant) {
        return restaurantService.ajouterRestaurant(restaurant);
    }

    @PutMapping(path = "dashboard/restaurants/update/{id}")
    public String modifierRestaurant(@RequestBody Restaurants restaurant, @PathVariable Long id) {
        return restaurantService.modifierRestaurant(restaurant,id);
    }

        @DeleteMapping(path = "dashboard/restaurants/{id}")
    public String supprimerRestaurant(@PathVariable Long id) {
        return restaurantService.supprimerRestaurant(id);
    }

}
