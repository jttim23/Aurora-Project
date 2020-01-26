package com.jedro.demo_aurora.controllers;

import com.jedro.demo_aurora.model.Reservation;
import com.jedro.demo_aurora.services.ReservationService;
import org.springframework.stereotype.Controller;

import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.text.ParseException;

@Controller
public class ReserveController {
    private ReservationService service;

    public ReserveController(ReservationService service) {
        this.service = service;
    }
@PostMapping("/reserve")
    public String submit(@ModelAttribute @Valid Reservation reservation, Errors errors) throws ParseException {
        if (errors.hasErrors()){
            System.out.println("errors");
            return "/reservationForm";

        }
        else if (service.validDate(reservation)){
            System.out.println("date valid");
    service.saveReservation(reservation);
    System.out.println("RESERVATION!!!!!!!!!");
        return "redirect:/payment";}
        else {
            System.out.println("date invalid");
            return "/reservationForm";
        }

}

}
