package com.example.bookmyshow.dtos;

import com.example.bookmyshow.Models.Booking;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateBookingRsponseDto {
    private Booking booking;
    private ResponseStatus responseStatus;
}
