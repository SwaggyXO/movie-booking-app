package com.devashish.theatreservice.repository;

import com.devashish.theatreservice.entity.Screen;
import com.devashish.theatreservice.entity.Screening;
import com.devashish.theatreservice.entity.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre, Long> {
    Theatre findByTheatreID(Long theatreID);

    Theatre findByTheatreNameAndCity(String theatreName, String city);
}
