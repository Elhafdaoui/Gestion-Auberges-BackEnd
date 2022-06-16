package com.Zakaria.auberge.Services;

import com.Zakaria.auberge.Entities.Reservations;

import java.util.List;
import java.util.Optional;

public interface ReservationService {

    public String ajouterReservation(Reservations reservation);

    public String supprimerReservation(Long id);

    public String modifierReservation(Reservations reservation, Long id);

    public List<Reservations> recupeReservations();

    public Optional<Reservations> recupererReservation(Long id);

    public List<Reservations> recupererDernieresReservations();

}
