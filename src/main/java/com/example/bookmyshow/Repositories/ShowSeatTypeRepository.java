package com.example.bookmyshow.Repositories;

import com.example.bookmyshow.Models.Show;
import com.example.bookmyshow.Models.ShowSeatType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowSeatTypeRepository extends JpaRepository<ShowSeatType, Integer> {
    List<ShowSeatType> findAllByShow(Show show);

}
