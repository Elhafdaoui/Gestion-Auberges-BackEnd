package com.Zakaria.auberge.Services;

import com.Zakaria.auberge.Entities.Users;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

public interface UsersService {

    public String ajouterUtilisateur(Users user);

    public String modifierUtilisateur(Users user, Long id);

    public String supprimerUtilisateur(Long id);

    public List<Users> recupererUtilisateurs();

    public Optional<Users> recupererUtilisateur(Long id);

    public Optional<Users> authenticate(Users user, HttpServletRequest request);
}
