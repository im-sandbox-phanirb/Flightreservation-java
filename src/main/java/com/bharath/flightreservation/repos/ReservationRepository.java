package com.bharath.flightreservation.repos;

import com.bharath.flightreservation.entities.Reservation;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    // Define your custom queries here if needed
}