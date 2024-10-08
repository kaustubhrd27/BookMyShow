package com.example.bookmyshow.Repositories;

import com.example.bookmyshow.Models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {
    @Override
    List<ShowSeat> findAllById(Iterable<Long> showSeatId);
    // why iterable -- >> find

    @Override
    ShowSeat save(ShowSeat showSeat);
    //Update + Insert => Upsert

}
