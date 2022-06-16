package com.Zakaria.auberge.Controllers;

import com.Zakaria.auberge.Entities.Reservations;
import com.Zakaria.auberge.Services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping(path = "/")
@RestController
@CrossOrigin
public class ReservationsController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping(path = "dashboard/reservations")
    public List<Reservations> recupererReservations() {
        return reservationService.recupeReservations();
    }

    @GetMapping(path = "dashboard/reservations/{id}")
    public Optional<Reservations> recupererReservation(@PathVariable Long id) {
        return reservationService.recupererReservation(id);
    }

    @PostMapping(path = "dashboard/reservations/new")
    public String ajouterReservation(@RequestBody Reservations reservation) {
        return reservationService.ajouterReservation(reservation);
    }

    @PutMapping(path = "dashboard/reservations/update/{id}")
    public String modifierReservation(@RequestBody Reservations reservation, @PathVariable Long id) {
        return reservationService.modifierReservation(reservation,id);
    }

    @DeleteMapping(path = "dashboard/reservations/{id}")
    public String supprimerReservation(@PathVariable Long id) {
        return reservationService.supprimerReservation(id);
    }

    @GetMapping(path = "dashboard/current")
    public List<Reservations> recupererReservationsCourantes(){
        return reservationService.recupererDernieresReservations();
    }


}
