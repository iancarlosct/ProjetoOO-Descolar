package com.decolar.sistema_voos.controller;

import com.decolar.sistema_voos.entity.Flight;
import com.decolar.sistema_voos.service.FlightService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Flights")
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @PostMapping
    public ResponseEntity<Flight> saveFlight(@RequestBody Flight flight) {
        Flight newFlight = flightService.save(flight);
        return ResponseEntity.ok(newFlight);
    }

    @GetMapping
    public ResponseEntity<List<Flight>> getAllFlights() {
        java.util.List<Flight> flights = flightService.listAll();
        return ResponseEntity.ok(flights);
    }
}
