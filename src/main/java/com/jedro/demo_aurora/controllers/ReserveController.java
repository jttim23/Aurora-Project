package com.jedro.demo_aurora.controllers;

import com.jedro.demo_aurora.model.Reservation;
import com.jedro.demo_aurora.services.ReservationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReserveController {
    private ReservationService service;

    public ReserveController(ReservationService service) {
        this.service = service;
    }
@PostMapping("/reserve")
    public String submit(@ModelAttribute Reservation reservation){
        service.saveReservation(reservation);
    System.out.println("RESERVATION!!!!!!!!!");
        return "redirect:/payment";
}

}
