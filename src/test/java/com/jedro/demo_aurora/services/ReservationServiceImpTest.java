package com.jedro.demo_aurora.services;

import com.jedro.demo_aurora.model.Reservation;
import com.jedro.demo_aurora.repositories.ReservationRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.jupiter.api.Assertions;

import java.text.ParseException;


class ReservationServiceImpTest {
    ReservationServiceImp serviceImp;
    @Mock
    ReservationRepository repository;

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        serviceImp = new ReservationServiceImp(repository);
    }
    @Test
    public void testDataValidation() throws ParseException {
        Reservation reservation = new Reservation();
        reservation.setCheckIn("2020-01-26");
        reservation.setCheckOut("2020-01-27");
        Assertions.assertTrue(serviceImp.validDate(reservation));

    }
}