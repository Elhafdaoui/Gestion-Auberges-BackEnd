package com.Zakaria.auberge.Implementations;

import com.Zakaria.auberge.Entities.Users;
import com.Zakaria.auberge.Repositories.UsersDao;
import com.Zakaria.auberge.Services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserImplementation implements UsersService {



    @Autowired
    UsersDao usersDao;

    PasswordEncoder passwordEncoder;

    public UserImplementation(UsersDao usersDao) {
        this.usersDao = usersDao;
        this.passwordEncoder=new BCryptPasswordEncoder();
    }

    @Override
    public String ajouterUtilisateur(Users user) {
        if(user!=null){
            if(!user.getPassword().matches(user.getConfirmation()))
                return "invalid passwords";
            else if(usersDao.findUsersByEmail(user.getEmail()).isPresent())
                return "Email existe déjà ! ";
            String encodedPassword = this.passwordEncoder.encode(user.getPassword());
            user.setPassword(encodedPassword);
            user.setConfirmation(encodedPassword);
            usersDao.save(user);
            return "Utilisateur(s) ajouter avec succès";
        }
        return "echec";
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
        List<Users> dbUsers = usersDao.findAll();
        System.out.println("Utilisateurs base données : "+dbUsers);
        if (dbUsers.size() != 0) {
            for (Users monUtilisateur : dbUsers) {
                if(!monUtilisateur.getEmail().matches(user.getEmail()))
                    continue;
                if (Objects.equals(user.getEmail(), monUtilisateur.getEmail()) && this.passwordEncoder.matches(user.getPassword(),monUtilisateur.getPassword())) {
                    HttpSession session= request.getSession();
                    session.setAttribute("user",user);
                    return Optional.of(user);
                } else {
                    return Optional.empty();

                }
            }
        }
        return Optional.empty();
    }
}
