package com.jedro.demo_aurora.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({"/index"})
    public String homePage(Model model) {
        System.out.println("wywołnie!!!!!!!");
        return "index";

    }
}
