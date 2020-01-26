package com.jedro.demo_aurora.services;

import com.jedro.demo_aurora.model.Reservation;
import com.jedro.demo_aurora.repositories.ReservationRepository;
import org.springframework.stereotype.Service;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
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
    @Override
    public boolean validDate(Reservation reservation) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateCheckIn = reservation.getCheckIn();
        String dateCheckOut = reservation.getCheckOut();
            Date dateIn = formatter.parse(dateCheckIn);
            Date dateOut = formatter.parse(dateCheckOut);
            Date todayDate = formatter.parse(formatter.format(new Date()));
            if (todayDate.after(dateIn)) {
                return false;
            }
             else if (dateIn.before(dateOut)) {
                    return true;
                }
                 return false;
    }
}
