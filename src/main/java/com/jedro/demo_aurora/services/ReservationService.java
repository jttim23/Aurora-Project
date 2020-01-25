package com.jedro.demo_aurora.services;

import com.jedro.demo_aurora.model.Reservation;

import java.util.List;


public interface ReservationService {
   List<Reservation> getReservations();
    Reservation findById(Long l);
    Reservation saveReservation(Reservation reservation);
}
