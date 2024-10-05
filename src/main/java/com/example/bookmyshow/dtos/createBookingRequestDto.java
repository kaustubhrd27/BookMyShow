package com.example.bookmyshow.dtos;

import com.example.bookmyshow.Models.User;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class createBookingRequestDto {
    private Long userID;
    private Long showId;
    private List<Long> showSeatIds;
}
