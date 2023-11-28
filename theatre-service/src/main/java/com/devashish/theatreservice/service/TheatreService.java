package com.devashish.theatreservice.service;

import com.devashish.theatreservice.entity.Screening;
import com.devashish.theatreservice.repository.ScreenRepository;
import com.devashish.theatreservice.repository.ScreeningRepository;
import com.devashish.theatreservice.repository.TheatreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TheatreService {
    private final TheatreRepository theatreRepository;
    private final ScreenRepository screenRepository;
    private final ScreeningRepository screeningRepository;

    public Screening[] getScreenings(Long theatreID, String movieName)
    {
        return (Screening[]) screeningRepository.findByMovieNameAndTheatreIDAndScreeningDate(movieName, theatreID, ZonedDateTime.now()).toArray();
    }
}
