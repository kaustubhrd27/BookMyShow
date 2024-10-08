package com.example.bookmyshow.Controllers;

import com.example.bookmyshow.Models.User;
import com.example.bookmyshow.Services.UserService;
import com.example.bookmyshow.dtos.ResponseStatus;
import com.example.bookmyshow.dtos.SignUpRequestDto;
import com.example.bookmyshow.dtos.SignUpResponseDto;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private UserService userService;

    public SignUpResponseDto signUp(SignUpRequestDto signUpRequestDto) {
        SignUpResponseDto signUpResponseDto = new SignUpResponseDto();
        try {
            User user = userService.SignUp(signUpRequestDto.getFirstName(),
                    signUpRequestDto.getEmail(),
                    signUpRequestDto.getPassword());

            signUpResponseDto.setUser(user);
            signUpResponseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            signUpResponseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return signUpResponseDto;
    }
}
