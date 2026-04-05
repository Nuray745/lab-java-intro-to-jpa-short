package org.ironhack.collections.labairline.repository;

import org.ironhack.collections.labairline.model.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightBookingRepository extends JpaRepository<FlightBooking, Integer> {
}
