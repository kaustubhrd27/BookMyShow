package com.example.bookmyshow.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel {
    @ManyToOne
    private User user;
    @ManyToMany
    private List<ShowSeat> showSeat;
    @OneToMany
    private List<Payment> payments;
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;
    private int amount;
}


/*
#Cardinalities

booking ---- user --> M : 1


   1            M
booking ---- showseat ---> M : M
   M             1

   1            M
booking ---- payment  -----> 1:M
   1             1
*/