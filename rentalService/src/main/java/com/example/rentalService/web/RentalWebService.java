package com.example.rentalService.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentalWebService {

    @GetMapping("/bonjour")
    public String disBonjour() {
        return "Bonjour !";
    }

}
