package com.Zakaria.auberge.Controllers;

import com.Zakaria.auberge.Services.UsersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Zakaria.auberge.Entities.Users;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@RequestMapping(path = "/")
@RestController
@CrossOrigin
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping(path = "dashboard/users")
    public List<Users> recupererUtilisateurs() {
        return usersService.recupererUtilisateurs();
    }

    @GetMapping(path = "dashboard/users/{id}")
    public Optional<Users> recupererUtilisateur(@PathVariable Long id) {
        return usersService.recupererUtilisateur(id);
    }

    @PostMapping(path = "signup")
    public String ajouterUtilisateur(@RequestBody Users user) {
        return usersService.ajouterUtilisateur(user);
    }

    @PutMapping(path = "dashboard/users/update/{id}")
    public String modifierUtilisateur(@RequestBody Users user, @PathVariable Long id) {
        return usersService.modifierUtilisateur(user,id);
    }

    @DeleteMapping(path = "dashboard/users/{id}")
    public String supprimerUtilisateur(@PathVariable Long id) {
        return usersService.supprimerUtilisateur(id);
    }

    @PostMapping(path = "login")
    public Optional<Users> authenticate(@RequestBody Users user, HttpServletRequest request){
       return usersService.authenticate(user,request);
    }

}
