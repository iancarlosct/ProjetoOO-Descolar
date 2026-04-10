package com.decolar.sistema_voos.service;

import com.decolar.sistema_voos.entity.Flight;
import com.decolar.sistema_voos.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    private final  FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public Flight save(Flight flight) {
        return flightRepository.save(flight);
    }

    public List<Flight> listAll() {
        return flightRepository.findAll();
    }
}
