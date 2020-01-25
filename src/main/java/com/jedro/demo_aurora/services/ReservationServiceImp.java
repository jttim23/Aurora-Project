package com.jedro.demo_aurora.services;

import com.jedro.demo_aurora.model.Reservation;
import com.jedro.demo_aurora.repositories.ReservationRepository;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class ReservationServiceImp implements ReservationService {
    private final ReservationRepository reservationRepository;

    public ReservationServiceImp(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public List<Reservation> getReservations() {
        return reservationRepository.findAll();


    }

    @Override
    public Reservation findById(Long l) {
        return null;
    }

    @Override
    public Reservation saveReservation(Reservation reservation) {
        reservationRepository.save(reservation);
        return reservation;
    }
}
