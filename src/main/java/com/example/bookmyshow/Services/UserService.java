package com.example.bookmyshow.Services;

import com.example.bookmyshow.Models.User;
import com.example.bookmyshow.Repositories.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User SignUp(String name, String email, String password) {
        Optional<User> user = userRepository.findByEmail(email);

        if (user.isPresent()) {
            //Basically we need to take the user to the login page in this case
            throw new RuntimeException("User already exists");
        }
        User user1 = new User();
        user1.setEmail(email);
        user1.setName(name);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        user1.setPassword(encoder.encode(password));
        User user2 = userRepository.save(user1);
        return user2;
    }
}
