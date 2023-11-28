package com.devashish.movieservice.dto;

import java.time.ZonedDateTime;
import java.util.List;

public class TheatreDTO {
    private Long TheatreID;
    private String theatreName;
    private String city;
    private List<ScreenDTO> screens;

    private List<ScreeningsDTO> screenings;
}


