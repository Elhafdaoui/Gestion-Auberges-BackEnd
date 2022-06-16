package com.Zakaria.auberge.Repositories;

import com.Zakaria.auberge.Entities.Reservations;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ReservationDao extends JpaRepository<Reservations,Long> {
    Optional<Reservations> findReservationsByDateReservationAndFinReservation(String dateReservation, String finReservation);
    Optional<Reservations> findReservationsByChambre(String chambre);
    Optional<Reservations> findReservationsById(Long id);

    List<Reservations> getAllByDateReservation(String dateReservation);
}
