package com.jedro.demo_aurora.controllers;

import com.jedro.demo_aurora.model.Reservation;
import com.jedro.demo_aurora.repositories.ReservationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
//    private ReservationRepository repository;
//
//    public HomeController(ReservationRepository repository) {
//        this.repository = repository;
//    }

    @GetMapping({"", "/", "/index"})
    public String homePage() {
        return "index";

    }
    @GetMapping("reservationForm")
    public String reservation(Model model){
        model.addAttribute(new Reservation());
        return "reservationForm";
    }
    @GetMapping("payment")
    public String paymentPage(){
        return "payment";
    }
}
