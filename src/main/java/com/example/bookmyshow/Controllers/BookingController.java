package com.example.bookmyshow.Controllers;

import com.example.bookmyshow.Models.Booking;
import com.example.bookmyshow.Services.BookingService;
import com.example.bookmyshow.dtos.CreateBookingRequestDto;
import com.example.bookmyshow.dtos.CreateBookingRsponseDto;
import com.example.bookmyshow.dtos.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookingController {

    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public CreateBookingRsponseDto createBooking(CreateBookingRequestDto requestDto) {
        CreateBookingRsponseDto createBookingRsponseDto = new CreateBookingRsponseDto();
        try {

            Booking booking = bookingService.createBooking(requestDto.getUserID(),
                    requestDto.getShowId(),
                    requestDto.getShowSeatIds()
            );
            createBookingRsponseDto.setResponseStatus(ResponseStatus.SUCCESS);
            createBookingRsponseDto.setBooking(booking);
        }
        catch (Exception e) {
            createBookingRsponseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return createBookingRsponseDto;
    }
}
