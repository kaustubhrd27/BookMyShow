package com.example.bookmyshow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theater  extends BaseModel {
    private String theaterName;
    private String theaterAddress;
    @OneToMany
    private List<Screen> screens;
    @ManyToOne
    private City city;
}
