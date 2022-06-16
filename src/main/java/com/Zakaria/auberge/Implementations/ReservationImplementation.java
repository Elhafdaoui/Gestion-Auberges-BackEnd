package com.Zakaria.auberge.Implementations;

import com.Zakaria.auberge.Repositories.ReservationDao;
import com.Zakaria.auberge.Entities.Reservations;
import com.Zakaria.auberge.Services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReservationImplementation implements ReservationService {

    @Autowired
    ReservationDao reservationDao;

    @Override
    public String ajouterReservation(Reservations reservation) {
        if(reservationDao.findReservationsByDateReservationAndFinReservation(reservation.getDateReservation(),reservation.getFinReservation()).isPresent())
        {
            if(reservationDao.findReservationsByChambre(reservation.getChambre()).isPresent())
                return "Cette réservation existe déjà";
        }

        reservationDao.save(reservation);
        return "ajouter avec succès";
    }


    @Override
    public String supprimerReservation(Long id) {
        reservationDao.deleteById(id);
        return "Réservation(s) supprimer avec succès";
    }

    @Override
    public String modifierReservation(Reservations reservation, Long id) {

        if(reservationDao.findReservationsById(reservation.getId()).isPresent()){
            reservationDao.save(reservation);
            return "modifier avec succès";
        }
        else{
            return "Introuvable !";
        }

    }

    @Override
    public List<Reservations> recupeReservations()
    {
        return reservationDao.findAll();
    }

    @Override
    public Optional<Reservations> recupererReservation(Long id) {
        return reservationDao.findReservationsById(id);
    }

    @Override
    public List<Reservations> recupererDernieresReservations() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
            return reservationDao.getAllByDateReservation(formatter.format(date));
    }

}
