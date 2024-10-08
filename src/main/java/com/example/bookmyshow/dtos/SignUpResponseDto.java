package com.example.bookmyshow.dtos;

import com.example.bookmyshow.Models.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpResponseDto {
    private ResponseStatus responseStatus;
    private User user;
}
