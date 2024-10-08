package com.example.bookmyshow.Repositories;

import com.example.bookmyshow.Models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
    @Override
     Booking save(Booking booking);
}
