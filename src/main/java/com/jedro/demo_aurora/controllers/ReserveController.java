package com.jedro.demo_aurora.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReserveController {
@PostMapping("reserve")
    public String handleReservation(){
    System.out.println("reservation!!!");
    return "redirect:/payment";
}
}
