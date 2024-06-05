package com.bharath.flightreservation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class FlightController {

    @GetMapping("/findFlights")
    public String displayFindFlights() {
        
        return "findFlights"; // Return the name of the Thymeleaf template
    }

}