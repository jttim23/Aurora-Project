package com.jedro.demo_aurora.controllers;

import com.jedro.demo_aurora.model.Reservation;
import com.jedro.demo_aurora.repositories.ReservationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"", "/", "/home"})
    public String homePage() {
        return "index";

    }

}
