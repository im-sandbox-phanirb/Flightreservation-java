package com.bharath.flightreservation.entities;

import jakarta.persistence.*;
import lombok.Data;




@Entity
@Data
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "checked_in")
    private boolean checkedIn;

    @Column(name = "number_of_bags")
    private int numberOfBags;

    @OneToOne
    private Passenger passenger;

    @OneToOne
    private Flight flight;

}