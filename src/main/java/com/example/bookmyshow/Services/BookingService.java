package com.example.bookmyshow.Services;

import com.example.bookmyshow.Models.Booking;

import java.util.List;

public interface BookingService {
    public Booking createBooking(Long userId, Long showId, List<Long> showSeatIds);
}
