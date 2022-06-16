package com.Zakaria.auberge.Implementations;

import com.Zakaria.auberge.Repositories.UsersDao;
import com.Zakaria.auberge.Services.UsersService;
import com.Zakaria.auberge.Entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@Service
public class UserImplementation implements UsersService {

    @Autowired
    UsersDao usersDao;

    public UserImplementation(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    @Override
    public String ajouterUtilisateur(Users user) {

        if(usersDao.findUsersByEmail(user.getEmail()).isPresent())
            return "Email existe déjà ! ";

        usersDao.save(user);
        return "Utilisateur(s) ajouter avec succès";
    }

    @Override
    public String modifierUtilisateur(Users user, Long id) {

        if(usersDao.findUsersByID(user.getID()).isPresent()){
            usersDao.save(user);
            return "modifier avec succès";
        }
        else{
            return "Introuvable !";
        }

    }

    @Override
    public String supprimerUtilisateur(Long id) {
        usersDao.deleteById(id);
        return "Utilisateur(s) supprimer avec succès";
    }

    @Override
    public List<Users> recupererUtilisateurs() {
        return usersDao.findAll();
    }

    @Override
    public Optional<Users> recupererUtilisateur(Long id) {
        return usersDao.findById(id);
    }

    @Override
    public Optional<Users> authenticate(Users user, HttpServletRequest request) {

        if(usersDao.findUsersByEmailAndPassword(user.getEmail(), user.getPassword()).isPresent())
        {
            HttpSession session= request.getSession();
            session.setAttribute("user",user);
            return Optional.of(user);
        }

        return Optional.empty();
    }

}
