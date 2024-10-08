package com.example.bookmyshow.Repositories;

import com.example.bookmyshow.Models.Show;
import com.example.bookmyshow.Models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long> {
    @Override
    Optional<Show> findById(Long showId);


}
