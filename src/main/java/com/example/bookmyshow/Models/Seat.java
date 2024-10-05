package com.example.bookmyshow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {
    private String seatName;
    private int rowNum;
    private int colNum;
    @ManyToOne
    private SeatType seatType;
}
