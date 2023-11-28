package com.devashish.theatreservice.repository;

import com.devashish.theatreservice.entity.Screening;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.ZonedDateTime;
import java.util.List;
@Repository
public interface ScreeningRepository extends JpaRepository<Screening, Long> {
    List<Screening> findByScreeningDate(ZonedDateTime screeningDate);

    List<Screening> findByMovieNameAndTheatreIDAndScreeningDate(String movieName, Long theatreID, ZonedDateTime screeningDate);
}
