package com.jedro.demo_aurora.services;

import com.jedro.demo_aurora.model.Reservation;
import com.jedro.demo_aurora.repositories.ReservationRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

    @RunWith(SpringRunner.class)
    @SpringBootTest
    public class ReservationServiceIT {
        public static final String CHECK_IN = "2020-01-26";


        @Autowired
        ReservationServiceImp serviceImp;
        @Autowired
        ReservationRepository repository;
        @Transactional
        @Test
        public void testSaveReservation() throws Exception{
            System.out.println(repository.findAll().toString());
            Iterable<Reservation> reservations = repository.findAll();
            Reservation testReservation = reservations.iterator().next();
            testReservation.setCheckIn(CHECK_IN);

            Reservation savedReservation= serviceImp.saveReservation(testReservation);

            Assertions.assertEquals(savedReservation.getCheckIn(),testReservation.getCheckIn());


        }

    }


