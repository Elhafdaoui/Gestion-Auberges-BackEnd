package com.Zakaria.auberge.Repositories;

import com.Zakaria.auberge.Entities.Users;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersDao extends JpaRepository<Users, Long> {
    Optional<Users> findUsersByEmail(String email);
    Optional<Users> findUsersByEmailAndPassword(String email, String password);
    Optional<Users> findUsersByID(Long id);
}
