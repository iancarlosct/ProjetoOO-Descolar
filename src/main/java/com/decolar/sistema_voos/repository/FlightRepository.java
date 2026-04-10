package com.decolar.sistema_voos.repository;

import com.decolar.sistema_voos.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
